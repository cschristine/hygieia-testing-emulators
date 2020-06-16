package com.capitalone.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
         // temp port configuration
         application.setDefaultProperties(Collections.<String, Object>singletonMap("server.port", "8089"));
        application.run(args);
    }
}
