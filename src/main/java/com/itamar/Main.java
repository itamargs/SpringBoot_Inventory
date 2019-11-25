package com.itamar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2 // enabling swagger
@SpringBootApplication//make sure that spring initializing the beans, recognize annotaions, configurations etc.
@EnableJpaRepositories(basePackages = {"com.itamar"}) //todo: remove this line
@ComponentScan("com") //todo: remove this line
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

}
