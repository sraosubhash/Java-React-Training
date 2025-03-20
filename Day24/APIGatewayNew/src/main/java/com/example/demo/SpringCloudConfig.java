package com.example.demo;
 
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class SpringCloudConfig {
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("employ/**").
						uri("http://localhost:9001/")
						.id("employeeModule"))
				
				.route(r -> r.path("consumer/**").
						uri("http://localhost:9002/")
						.id("consumerModule"))
				.build();
	}
	
	
 
}
 
 