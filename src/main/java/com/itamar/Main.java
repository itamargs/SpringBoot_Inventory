package com.itamar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication//make sure that spring initializing the beans, recognize annotaions, configurations etc.
@EnableJpaRepositories(basePackages = {"com.itamar"})
@ComponentScan("com")
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }

}
