package com.sujun.demo.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) {

        System.setProperty("dubbo.application.logger", "log4j2");
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

}
