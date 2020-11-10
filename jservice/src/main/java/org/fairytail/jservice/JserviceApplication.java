package org.fairytail.jservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ServletComponentScan
@EnableSwagger2
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages={"org.fairytail.jservice.bean", "org.fairytail.jservice.demo.bean"})
public class JserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JserviceApplication.class, args);
    }

}
