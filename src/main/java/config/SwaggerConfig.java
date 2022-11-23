package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

import java.net.URL;
import java.util.Collections;

@Configuration
public class SwaggerConfig {

    private ApiInfo apiInfo(){

        return new ApiInfo("Projeto_Integrador Rest APIs", "API POUPA+", "1.0", "Termos de Serviço",
                    new Contact("Kayra","www.org.com", "kayrasilvha@gmail.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }}
