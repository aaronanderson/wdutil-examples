package wdutil.wdjws;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.workday.common.api.WorkersApi;
import com.workday.common.model.WorkerSummaryA489aef739484c13a59e6d502a9e7b68;
import com.workday.common.model.WorkersGet200Response;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.ext.Provider;

@ExtendWith(WeldJunit5Extension.class)
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
			WorkersGet200Response workers = workersApi.workersGet(100L, offset, null);
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
