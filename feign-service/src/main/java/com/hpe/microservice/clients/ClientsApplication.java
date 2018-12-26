package com.hpe.microservice.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Feign客户端中心
 * @date 2018/12/18 13:09
 */
@SpringBootApplication(scanBasePackages = "com.hpe.microservice.clients")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hpe.microservice.clients"})
public class ClientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }

}
