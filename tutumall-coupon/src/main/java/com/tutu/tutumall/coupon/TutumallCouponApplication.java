package com.tutu.tutumall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@MapperScan("com.tutu.tutumall.coupon.dao")
@EnableDiscoveryClient
public class TutumallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutumallCouponApplication.class, args);
    }

}
