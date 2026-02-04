package com.eventify.eventmanagement.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
  @Bean
  public OpenAPI eventManagementOpenAPI() {
    return new OpenAPI()
        .info(new Info()
            .title("Event Management API")
            .description("APIs for Event & User Management")
            .version("1.0.0"));
  }

}
