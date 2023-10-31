package com.api.compare.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.api.compare.rate")
@EnableDiscoveryClient
public class CompareApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompareApiApplication.class, args);
	}

}
