package com.tutu.tutumall.product;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.tutu.tutumall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class TutumallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutumallProductApplication.class, args);
    }

}
