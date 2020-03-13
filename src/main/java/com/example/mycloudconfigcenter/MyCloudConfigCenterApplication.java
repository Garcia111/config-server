package com.example.mycloudconfigcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MyCloudConfigCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCloudConfigCenterApplication.class, args);
    }

}
