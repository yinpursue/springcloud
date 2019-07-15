package com.yin.yinspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YinspringcloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(YinspringcloudApplication.class, args);
	}

}
