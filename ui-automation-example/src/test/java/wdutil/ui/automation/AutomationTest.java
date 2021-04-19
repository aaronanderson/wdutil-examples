package wdutil.ui.automation;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import wdutil.ui.automation.AutomationUtil.DownloadFileWatcher;

public class AutomationTest {

    private static Properties tenantProperties;

    @BeforeAll
    public static void init() throws Exception {
        tenantProperties = new Properties();
        tenantProperties.load(Files.newInputStream(Paths.get("tenant.properties")));

    }

    private static WebDriver newDriver() throws Exception {
        if (tenantProperties.containsKey("edgedriver.path")) {
            return AutomationUtil.EdgeDriverBuilder.newInstance(Paths.get(tenantProperties.getProperty("edgedriver.path"))).downloadPath(Paths.get(tenantProperties.getProperty("fileDownloadPath"))).build();
            //} else if (tenantProperties.containsKey("chromedriver.path")) {
            //    return AutomationUtil.ChromeDriverBuilder.newInstance(Paths.get(tenantProperties.getProperty("chromedriver.path"))).downloadPath(Paths.get(tenantProperties.getProperty("fileDownloadPath"))).build();
        } else if (tenantProperties.containsKey("geckodriver.path")) {
            return AutomationUtil.fireFoxDriver(Paths.get(tenantProperties.getProperty("geckodriver.path")), Paths.get(tenantProperties.getProperty("fileDownloadPath")));
        } else {
            throw new Exception("webdriver path is missing");
        }
    }

    private static void login(AutomationUtil util) throws Exception {
        util.workdayLogin(tenantProperties.getProperty("workday.url"), tenantProperties.getProperty("workday.username"), tenantProperties.getProperty("workday.password"), Boolean.parseBoolean(tenantProperties.getProperty("workday.trustedDevice")));
    }

    //@Test
    public void integrationScreenshot() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver());
        try {
            login(util);

            String integrationPrefix = tenantProperties.getProperty("integrationScreenshot.prefix");
            WebElement intLink = util.search("intsys", integrationPrefix);
            // intLink.click();
            util.relatedAction(intLink, "Integration", "Launch / Schedule");

            TakesScreenshot takeScreenShot = ((TakesScreenshot) util.getDriver());
            byte[] screenShot = takeScreenShot.getScreenshotAs(OutputType.BYTES);
            Path fileDownloadPath = Paths.get(tenantProperties.getProperty("integrationScreenshot.file"));
            Files.createDirectories(fileDownloadPath.getParent());
            Files.write(fileDownloadPath, screenShot);
        } finally {
            util.getDriver().close();
        }
        assertTrue(Files.exists(Paths.get(tenantProperties.getProperty("integrationScreenshot.file"))));
    }

    //@Test
    public void xpressoEnrollmentCount() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver());
        try {

            login(util);

            util.search("Enrollment Count").click();

            // util.selectOption("Benefit Group", "U.S. Hourly", "Aus");
            // WebElement active = util.searchOptionByGroup("Benefit Group", "Benefit Groups Available");
            // active.sendKeys(Keys.chord(Keys.CONTROL, "a")); active.sendKeys(Keys.ENTER);
            util.selectSearchOption("Benefit Group", "U.S. Hourly", "Aus", "Ret");
            util.clickOk();

            Path excelFile = util.clickExcelDownload(Paths.get(tenantProperties.getProperty("fileDownloadPath")), Duration.of(60, ChronoUnit.SECONDS));
            assertTrue(Files.exists(excelFile));
        } finally {
            util.getDriver().close();
        }

    }

    private class IntegrationAuditRowHandler implements Consumer<WebElement> {
        private String lastIntegration;
        private int rowCount = 0;

        @Override
        public void accept(WebElement row) {
            rowCount++;
            // System.out.format("row id: %d %s %s \n", rowCount, row.getAttribute("rowid"), row.getAttribute("data-automation-id"));
            List<WebElement> firstRowValue = row.findElements(By.xpath("./td[1]//div[@data-automation-label]"));
            if (!firstRowValue.isEmpty()) {
                lastIntegration = firstRowValue.get(0).getText();
            }
            String severity = row.findElement(By.xpath("./td[2]//div[@data-automation-label]")).getText();
            String problem = row.findElement(By.xpath("./td[3]//div[@data-automation-label]")).getText();
            String solution = row.findElement(By.xpath("./td[4]//div[@class='gwt-HTML']")).getText().replace("\n", "");
            System.out.format("\"%s\",\"%s\",\"%s\",\"%s\"\n", lastIntegration, severity, problem, solution);
            rowCount++;
        }

    }

    //@Test
    public void xpressoIntegrationAudit() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver(), Duration.of(120, ChronoUnit.SECONDS));
        try {
            login(util);

            util.search("Integration Exception Audit").click();
            util.clickOk();

            IntegrationAuditRowHandler rowHandler = new IntegrationAuditRowHandler();
            util.scrollTable(rowHandler);
            //System.out.format("Processed %d rows\n", rowHandler.rowCount);
            assertTrue(rowHandler.rowCount > 0);
        } finally {
            util.getDriver().close();
        }

    }

    //@Test
    public void deleteUnusedCalcFields() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver(), Duration.of(60, ChronoUnit.SECONDS));
        try {
            login(util);
            util.search("Delete Calculated Field").click();
            String search = tenantProperties.getProperty("deleteUnusedCalcFields.prefix");
            final AtomicBoolean finished = new AtomicBoolean(false);

            Consumer<List<WebElement>> resultHandler = w -> {
                if (!w.isEmpty()) {
                    //w.get(0).findElement(By.xpath("//div"));
                    System.out.format("%s\n", w.get(0).getAttribute("data-automation-label"));
                    w.get(0).click();
                    util.waitForLoad();
                } else {
                    finished.set(true);
                }
            };
            while (!finished.get()) {
                util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Calculated Field for Delete']")));
                String deleteUrl = util.getDriver().getCurrentUrl();
                util.selectSearchOption("Calculated Field for Delete", resultHandler, search);
                util.clickOk();
                util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Are you sure you want to delete:']")));
                util.clickOk();
                util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='The instance has been deleted.']")));
                util.clickDone();
                util.getDriver().get(deleteUrl);

                //util.getActions().pause(Duration.of(2, ChronoUnit.SECONDS)).build().perform();
                //wait a second for Workday to update the search index

                //
                // driver.navigate().back();

            }

        } finally {
            util.getDriver().close();
        }
    }

    //@Test
    public void createPositions() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver(), Duration.of(60, ChronoUnit.SECONDS));
        try {
            login(util);
            util.startProxy("tserrano");
            util.search("Create Position").click();
            util.waitForLoad();
            util.selectSearchOption("Supervisory Organization", "IT HelpDesk Department");
            util.clickOk();

            // close the current open positions popup so it doesn't interfer with the prompt input automation.
            //util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-automation-id='closeButton']"))).click();
            util.searchOptionByGroup("Position Request Reason", "Create Position > Position Request", "Create Position > Position Request > Staff New Project");

            util.enterText("Job Posting Title", "Automation Test");
            LocalDate date = LocalDate.now().withDayOfMonth(1);
            util.enterDate("Availability Date", date);
            util.getActions().pause(Duration.of(2, ChronoUnit.SECONDS)).build().perform();
            util.enterDate("Earliest Hire Date", date);

            util.enterCheckbox("No Job Restrictions", true);
            util.waitForLoad();

            util.clickSubmit();
            util.clickDone();

            util.startProxy("jtaylor");
            util.openInbox();

            //util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-automation-id='closeButton']"))).click();

            //approve position
            //util.clickApprove();

            //util.clickDone();

            util.stopProxy();
        } finally {
            util.getDriver().close();
        }

    }

    //@Test
    public void payslipDownload() throws Exception {
        AutomationUtil util = new AutomationUtil(newDriver(), Duration.of(60, ChronoUnit.SECONDS));
        DownloadFileWatcher fileWatcher = new DownloadFileWatcher(Paths.get(tenantProperties.getProperty("fileDownloadPath")));
        try {
            login(util);
            String employeeId = "XXXXX";
            String employeeWID = "XXXXX";
            Set<String> periodEndDateFilter = new HashSet<>();
            //The task URL can be located by navigating to worker -> pay -> Payslips ->  View All Payslips which should active the View Payslips task.
            String workerURL = String.format("%s/d/inst/%s/rel-task/XXXXXXX.htmld", tenantProperties.getProperty("workday.url"), employeeWID);

            System.out.format("Downloading payslips for %s\n", employeeId);

            util.getDriver().navigate().to(workerURL);

            ExpectedCondition<WebElement> hasPayslips = ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Payslips']"));
            ExpectedCondition<WebElement> hasNoPayslips = ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Payslips']"));
            ExpectedCondition<Boolean> notLoading = ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@data-automation-id='loadingGlass' and @data-automation-loadingpanelhidden='true']"));

            util.getWait().until(ExpectedConditions.or(ExpectedConditions.and(hasPayslips, notLoading), hasNoPayslips));

            List<WebElement> none = util.getDriver().findElements(By.xpath("//div[text()='none exist']"));
            if (none.size() > 0) {
                System.err.format("No payslips available for %s\n", employeeId);
                return;
            }

            JavascriptExecutor jse = (JavascriptExecutor) util.getDriver();
            //scroll down to load additional pages of payslips before processing them.
            WebElement payslipTable = util.getDriver().findElement(By.xpath("//div[@data-automation-groups-as-tabs and .//span[text()='Payslips']][last()]"));
            payslipTable.click();
            for (int i = 0; i < 4; i++) {
                for (WebElement subTable : payslipTable.findElements(By.xpath(String.format("//div[starts-with(@data-automation-id, 'MainTable-%d')]", i)))) {
                    util.getActions().sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
                    Thread.sleep(1000);
                    util.getWait().until(notLoading);
                }
            }

            List<WebElement> rows = util.getDriver().findElements(By.xpath("//div[starts-with(@data-automation-id, 'MainTable-')]//table//tr"));

            for (WebElement row : rows) {

                List<WebElement> downloads = row.findElements(By.xpath(".//button[@title='Print' or @title='View/Print']"));
                if (downloads.size() > 0) {
                    String paymentDate = row.findElement(By.xpath(".//th/div")).getText();
                    String periodStartDate = row.findElement(By.xpath(".//td[1]/div")).getText();
                    String periodEndDate = row.findElement(By.xpath(".//td[2]/div")).getText();
                    String periodEndDateYear = periodEndDate.substring(periodEndDate.length() - 4);
                    if (!periodEndDateFilter.isEmpty() && !periodEndDateFilter.contains(periodEndDateYear)) {
                        continue;
                    }
                    for (WebElement download : downloads) {
                        //Popups can cause visibility problems. Bypass the "is not clickable at" exception with a Javascript click.
                        jse.executeScript("arguments[0].click();", download);

                        util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-automation-id='pdfDownloadButton']"))).click();
                        util.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-automation-id='pdfCloseButton']"))).click();
                        Path downloadFile = fileWatcher.waitForDownload();
                        try (InputStream in = Files.newInputStream(downloadFile); PDDocument w2File = PDDocument.load(in);) {
                            int pageCount = 0;
                            Iterator<PDPage> pages = w2File.getPages().iterator();
                            while (pages.hasNext()) {
                                pageCount++;
                                PDPage page = pages.next();
                                PayslipReader payslipReader = new PayslipReader();
                                payslipReader.processPage(page);
                                if (!payslipReader.getPaymentDate().isBlank()) {
                                    System.out.format("Processed payslip file %s: %s %s %s: %s \n", downloadFile.toAbsolutePath(), payslipReader.periodStartDate, payslipReader.periodEndDate, payslipReader.paymentDate, payslipReader.gross);
                                    return; //just download one file for demonstration purposes.
                                }
                            }
                        }
                        Files.delete(downloadFile);

                    }

                }

            }

        } finally {
            util.getDriver().close();
        }

    }

    public static class PayslipReader extends PDFTextStripper {

        private StringBuilder employeeId = new StringBuilder();
        private StringBuilder periodStartDate = new StringBuilder();
        private StringBuilder periodEndDate = new StringBuilder();
        private StringBuilder paymentDate = new StringBuilder();
        private StringBuilder gross = new StringBuilder();

        public PayslipReader() throws IOException {
            super.setSortByPosition(true);
            super.setStartPage(0);
            this.output = new StringWriter();
        }

        public String getEmployeeId() {
            return employeeId.toString();
        }

        public String getPeriodStartDate() {
            return periodStartDate.toString();
        }

        public String getPeriodEndDate() {
            return periodEndDate.toString();
        }

        public String getPaymentDate() {
            return paymentDate.toString();
        }

        public String getGross() {
            return gross.toString();
        }

        @Override
        protected void writeString(String string, List<TextPosition> textPositions) throws IOException {

            for (TextPosition text : textPositions) {
                //System.out.println(string + " String[" + text.getXDirAdj() + "," + text.getYDirAdj() + " fs=" + text.getFontSize() + " xscale=" + text.getXScale() + " height=" + text.getHeightDir() + " space=" + text.getWidthOfSpace() + " width=" + text.getWidthDirAdj() + "]" + text.getUnicode());
                if (text.getXDirAdj() >= 300.0 && text.getXDirAdj() <= 330.0 && text.getYDirAdj() >= 138.0 && text.getYDirAdj() <= 140.0) {
                    employeeId.append(text.getUnicode());
                }
                if (text.getXDirAdj() >= 350.0 && text.getXDirAdj() <= 400.0 && text.getYDirAdj() >= 138.0 && text.getYDirAdj() <= 140.0) {
                    periodStartDate.append(text.getUnicode());
                }
                if (text.getXDirAdj() >= 415.0 && text.getXDirAdj() <= 460.0 && text.getYDirAdj() >= 138.0 && text.getYDirAdj() <= 140.0) {
                    periodEndDate.append(text.getUnicode());
                }
                if (text.getXDirAdj() >= 480.0 && text.getXDirAdj() <= 525.0 && text.getYDirAdj() >= 138.0 && text.getYDirAdj() <= 140.0) {
                    paymentDate.append(text.getUnicode());
                }
                if (text.getXDirAdj() >= 180.0 && text.getXDirAdj() <= 260.0 && text.getYDirAdj() >= 162.0 && text.getYDirAdj() <= 165.0) {
                    gross.append(text.getUnicode());
                }

            }
        }

    }

}
