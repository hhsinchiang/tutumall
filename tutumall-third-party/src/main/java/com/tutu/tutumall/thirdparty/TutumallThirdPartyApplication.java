package com.tutu.tutumall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class TutumallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutumallThirdPartyApplication.class, args);
    }

}
