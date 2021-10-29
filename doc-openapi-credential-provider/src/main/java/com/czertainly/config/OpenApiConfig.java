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
    public GroupedOpenApi credentialProviderApis() {
        return GroupedOpenApi.builder()
        		.group("credential-provider")
                .packagesToScan("com.czertainly.api.impl")
                //.pathsToMatch("/v1/**")
                .build()
                ;
    }

    @Bean
    public OpenAPI credentialProviderOpenAPI() {
        Map<String, Object> logoExtension = new HashMap<>();
        Map<String, Object> logoExtensionFields = new HashMap<>();
        logoExtensionFields.put("url", "images/czertainly_color_H.svg");
        logoExtension.put("x-logo", logoExtensionFields);

        return new OpenAPI()
                .info(new Info().title("CZERTAINLY Credential Provider Connector API")
                        .description("REST API for implementations of custom Credential Provider")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Apache License Version 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0"))
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
