package io.pivotal.portfolio.config;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.cloud.util.UriInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@Configuration
@ServiceScan
@Profile("Cloud")
public class CloudConfig extends AbstractCloudConfig {

	@Bean
	public UriInfo quoteService() {
		return connectionFactory().service("quoteService", UriInfo.class);
	}
	
	@Bean
	public UriInfo accountService() {
		return connectionFactory().service("accountService", UriInfo.class);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
