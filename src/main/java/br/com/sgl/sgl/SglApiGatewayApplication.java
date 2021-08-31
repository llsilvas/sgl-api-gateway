package br.com.sgl.sgl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class SglApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SglApiGatewayApplication.class, args);
    }

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // Simple re-route from: /get to: http://httpbin.org/80
//                // And adds a simple "hello:world" HTTP Header
//                .route(p -> p
//                        .path("/user")
//                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://localhost:8086/"))
//                .build();
//    }

}
