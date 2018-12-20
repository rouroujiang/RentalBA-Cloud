package com.hpe.microservice.intelligence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 自动化客户端
 * @author song xiaolong
 * @date 2018/12/18 13:09
 */
@SpringBootApplication
@EnableEurekaClient
public class IntelligenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelligenceApplication.class, args);
    }

}
