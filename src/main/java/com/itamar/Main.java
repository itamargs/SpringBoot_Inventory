package com.itamar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//make sure that spring initializing the beans, recognize annotaions, configurations etc.
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }


}
