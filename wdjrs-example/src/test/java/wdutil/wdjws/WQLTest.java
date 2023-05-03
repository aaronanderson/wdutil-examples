package wdutil.wdjws;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

//import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import wdutil.wdjws.rest.BearerAuthenticator;
import wdutil.wdjws.rest.WQL;

public class WQLTest {

	private static Logger LOG = LoggerFactory.getLogger(WQLTest.class);
	private static Properties testProperties;

	@BeforeAll
	public static void init() throws Exception {
		testProperties = new Properties();
		testProperties.load(Files.newInputStream(Paths.get("../test.properties"), StandardOpenOption.READ));
	}

	@Test
	public void queryWQL() throws Exception {
		//Requires Workday API Client scope System

		BearerAuthenticator auth = new BearerAuthenticator(testProperties.getProperty("workday.accessToken"));
		JsonObject dataSources = WQL.datasources(testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"), null, auth, JsonObject.class);
		LOG.info("dataSources {} ", dataSources);

		JsonObject dataSource = WQL.datasource(testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"), "1edd77f5e9754d71872102b5a5f2cd8e", auth, JsonObject.class);
		LOG.info("dataSource {} ", dataSource);

		JsonObject dataSourceFields = WQL.datasourceFields(testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"), "1edd77f5e9754d71872102b5a5f2cd8e", null, auth, JsonObject.class);
		LOG.info("dataSource Fields {} ", dataSourceFields);

		JsonObject dataSourceFilters = WQL.datasourceFilters(testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"), "1edd77f5e9754d71872102b5a5f2cd8e", auth, JsonObject.class);
		LOG.info("dataSource Filters {} ", dataSourceFilters);
		
		JsonObject query = WQL.query(testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"), "SELECT firstName,location FROM allWorkers", auth, JsonObject.class);
		LOG.info("Query All Workers {} ", query);
	}

}
