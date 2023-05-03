package wdutil.wdjws;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
//import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.workday.common.api.WorkersApi;
import com.workday.common.model.WorkerSummaryA489aef739484c13a59e6d502a9e7b68;
import com.workday.common.model.WorkersGet200Response;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ext.Provider;

public class CommonTest {

	private static Logger LOG = LoggerFactory.getLogger(CommonTest.class);
	private static Properties testProperties;

	@BeforeAll
	public static void init() throws Exception {
		testProperties = new Properties();
		testProperties.load(Files.newInputStream(Paths.get("../test.properties"), StandardOpenOption.READ));
	}

	@Test
	public void getWorkers() throws Exception {
		//requires Workday API Client scopes Tenant Non-Configurable, Staffing 
		//WorkersApi workersApi = RestClientBuilder.newBuilder().baseUri(new URI(String.format("https://%s/ccx/api/v1/%s", testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant")))).register(new OidcClientRequestCustomFilter()).build(WorkersApi.class);
		ResteasyWebTarget target = (ResteasyWebTarget)ClientBuilder.newBuilder().register(new OidcClientRequestCustomFilter()).build().target(new URI(String.format("https://%s/ccx/api/v1/%s", testProperties.getProperty("workday.host"), testProperties.getProperty("workday.tenant"))));
		WorkersApi workersApi = target.proxyBuilder(WorkersApi.class).defaultConsumes(MediaType.APPLICATION_JSON).build();

		long offset = 0;
		long total = 0;
		do {
			WorkersGet200Response workers = workersApi.workersGet(100L, offset, null);
			assert (workers.getData().size() > 0);
			total = workers.getTotal();
			offset = offset + workers.getData().size() + 1;
			for (WorkerSummaryA489aef739484c13a59e6d502a9e7b68 worker : workers.getData()) {
				LOG.info("{} - {}", worker.getId(), worker.getDescriptor());
			}
		} while (offset <= total);
	}

	@Provider
	@Priority(Priorities.AUTHENTICATION)
	public class OidcClientRequestCustomFilter implements ClientRequestFilter {

		@Override
		public void filter(ClientRequestContext requestContext) throws IOException {
			requestContext.getHeaders().add(HttpHeaders.AUTHORIZATION, "Bearer " + testProperties.getProperty("workday.accessToken"));
		}
	}

}
