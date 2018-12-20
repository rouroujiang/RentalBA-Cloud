package com.hpe.microservice.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Feign客户端中心
 * @author song xiaolong
 * @date 2018/12/18 13:09
 */
@SpringBootApplication(scanBasePackages = "com.hpe.microservice.clients")
@EnableDiscoveryClient
@EnableCircuitBreaker
//@SpringCloudApplication
@EnableFeignClients(basePackages = {"com.hpe.microservice.clients"})
public class ClientsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }

}
