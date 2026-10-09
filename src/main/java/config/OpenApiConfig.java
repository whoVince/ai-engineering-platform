package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        OpenAPI openAPI = new OpenAPI()
            .specVersion(SpecVersion.V31)
            .info(new Info()
                .title("AI Engineering Platform API")
                .version("0.1.0")
                .description("API for generation, review, validation, and usage estimates. | DomÃƒÂ­nio: 5 entidades, 4 mÃƒÂ³dulos, 29 campos, 0 relacionamentos.")
                .contact(new Contact()
                    .name("AI Engineering Platform Contributors")
                    .email("")
                    .url("https://github.com/whovince"))
                .license(new License()
                    .name("MIT")
                    .url("https://opensource.org/licenses/MIT")))
            .servers(List.of(

                new Server().url("http://localhost:8080").description("Local development [development]")

            ))
            .tags(List.of(

                new Tag().name("Project Management").description("Modulo Project Management com recursos: EngineeringProject."),

                new Tag().name("Generation").description("Modulo Generation com recursos: GenerationRun."),

                new Tag().name("Artifact Review").description("Modulo Artifact Review com recursos: GeneratedArtifact, ReviewDecision."),

                new Tag().name("Cost & Observability").description("Modulo Cost & Observability com recursos: UsageEstimate.")

            ))
            .components(new Components());


        openAPI.getComponents().addSecuritySchemes(
            "basicAuth",
            new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("basic")
        );
        openAPI.addSecurityItem(new SecurityRequirement().addList("basicAuth"));



        // Public paths: /auth/**, /swagger-ui/**, /swagger-ui.html, /v3/api-docs/**, /actuator/health


        return openAPI;
    }
}

