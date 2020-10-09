package org.fairytail.jservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"org.fairytail.jservice.bean", "org.fairytail.jservice.demo.bean"})
public class JserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JserviceApplication.class, args);
    }

}
