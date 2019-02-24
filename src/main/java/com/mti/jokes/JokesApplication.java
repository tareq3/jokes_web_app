package com.mti.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mti"}) /* we are asking spring boot to scan this package as well the default package*/
public class JokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesApplication.class, args);
    }

}
