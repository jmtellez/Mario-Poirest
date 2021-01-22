package com.boyz.mariopoirest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.time.LocalDate;
import java.time.LocalDateTime;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.boyz.mariopoirest.REST"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .directModelSubstitute(LocalDate.class, java.util.Date.class)
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class);
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Mario PoiREST")
                .description("A free REST API for random Mario Poire pictures - Mario as a Service (MaaS)")
                .license("The Boyz Inc")
                .licenseUrl("https://jmtellez.com")            
                .version("0.0.1")                
                .contact(new Contact("Dr. Phil Therapist Session","https://jmtellez.com", "jmt3559@gmail.com"))
                .build();
    }
}