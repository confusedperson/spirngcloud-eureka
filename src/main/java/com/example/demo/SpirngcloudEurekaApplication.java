package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 服务注册中心
 * @author lvj
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpirngcloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngcloudEurekaApplication.class, args);
	}

}
