package com.itamar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;


@EnableSwagger2 // enabling swagger
@SpringBootApplication//make sure that spring initializing the beans, recognize annotaions, configurations etc.
@EnableJpaRepositories(basePackages = {"com.itamar"}) //todo: remove this line
@ComponentScan("com") //todo: remove this line
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // Creates Spring Bean for customize Swagger (For showing only relevant info on the HTML API catalog)
    @Bean
    public Docket swaggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any()) // set for presenting just our APIs
                .apis(RequestHandlerSelectors.basePackage("com.itamar")) //set to look only on our package
                .build()
                .apiInfo(apiInfo());
        //.paths(PathSelectors.ant("/items/*"))
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Inventory items -Spring Boot App",
                "<h3>Handles inventory items </h3> \n \nUsing: Spring Boot, JPA, H2 DB, Swagger, Angular.",
                "V1",
                "Free to use",
                new Contact("Itamar G", "https://github.com/itamargs/", ""),
                "", "", Collections.emptyList());
    }

}
