package com.czertainly.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class OpenApiConfig {
	
	@Autowired
	ServletContext context;
	
    @Bean
    public GroupedOpenApi caConnectorApis() {
        return GroupedOpenApi.builder()
        		.group("ca-connector")
                .packagesToScan("com.czertainly.api.impl")
                //.pathsToMatch("/v1/**")
                .build()
                ;
    }

    @Bean
    public OpenAPI caConnectorOpenAPI() {
        Map<String, Object> logoExtension = new HashMap<>();
        Map<String, Object> logoExtensionFields = new HashMap<>();
        logoExtensionFields.put("url", "images/czertainly_color_H.svg");
        logoExtension.put("x-logo", logoExtensionFields);

        return new OpenAPI()
                .info(new Info().title("CZERTAINLY CA Connector v2 API")
                        .description("REST API for implementations of custom v2 CA Connector")
                        .version("1.0.1")
                        .license(new License()
                                .name("MIT License")
                                .url("https://github.com/3KeyCompany/CZERTAINLY/blob/develop/LICENSE.md"))
                        .extensions(logoExtension)
                        .contact(new Contact()
                                .name("CZERTAINLY")
                                .url("https://www.czertainly.com")
                                .email("getinfo@czertainly.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("CZERTAINLY Documentation")
                        .url("https://www.czertainly.com"))
                .servers(null)
                ;
    }
}
