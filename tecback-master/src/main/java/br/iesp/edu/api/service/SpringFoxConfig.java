package br.iesp.edu.api.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket swagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaInfo());
    }



    private ApiInfo metaInfo(){
        ApiInfo apiInfo = new ApiInfo(
           "API REST tecback",
            "API REST para a disciplina de Tecnologias para Back-End",
            "1.0",
            "Terms of Service",
            new Contact("Vinicius Cruz", "https://linkedin.com/in/vinicius-n-cruz/","viniciuscruz846@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licensen.html", new ArrayList<VendorExtension>()

        );
        return apiInfo;
    }



}
