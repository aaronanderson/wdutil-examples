package wdutil.wdjws;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.ext.Provider;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.workday.common.api.WorkersApi;
import com.workday.common.model.InlineResponse200;
import com.workday.common.model.WorkerSummaryA489aef739484c13a59e6d502a9e7b68;

public class CommonTest {

    private static Logger LOG = LoggerFactory.getLogger(CommonTest.class);
    private static Properties testProperties;

    @BeforeAll
    public static void init() throws Exception {
        testProperties = new Properties();
        testProperties.load(Files.newInputStream(Paths.get("../test.properties"), StandardOpenOption.READ));
    }

    @Test
    public void getReferencesTest() throws Exception {
        WorkersApi workersApi = RestClientBuilder.newBuilder().baseUri(new URI(String.format("https://%s/ccx/api/v1/%s", testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant")))).register(new OidcClientRequestCustomFilter()).build(WorkersApi.class);

        long offset = 0;
        long total = 0;
        do {
            InlineResponse200 workers = workersApi.workersGet(null, 100L, offset);
            assert (workers.getData().size() > 0);
            total = workers.getTotal();
            offset = offset + workers.getData().size();
            for (WorkerSummaryA489aef739484c13a59e6d502a9e7b68 worker : workers.getData()) {
                LOG.info("{} - {}", worker.getId(), worker.getDescriptor());
            }
        } while (offset <= total);
    }

    @Provider
    @Priority(Priorities.AUTHENTICATION)
    @RequestScoped
    public class OidcClientRequestCustomFilter implements ClientRequestFilter {

        @Override
        public void filter(ClientRequestContext requestContext) throws IOException {
            requestContext.getHeaders().add(HttpHeaders.AUTHORIZATION, "Bearer " + testProperties.getProperty("workday.accessToken"));
        }
    }

}
