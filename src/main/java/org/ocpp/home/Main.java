package org.ocpp.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.ocpp.home", "org.ocpp.client"})
@SpringBootApplication(scanBasePackages = {"org.ocpp.home"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}