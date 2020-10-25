package com.tutu.tutumall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 *
 * 1 想要远程调用别的服务
 *   1.引入open-feign
 *   2.编写一个借口，告诉springcloud这个借口需要调用远程服务
 *      1 声明接口的没一个方法都是调用哪个远程服务的哪个请求
 *   3.开启远程调用功能
 *
 */



@EnableFeignClients(basePackages = "com.tutu.tutumall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class TutumallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutumallMemberApplication.class, args);
    }

}
