package com.api.AMAZON;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.api.AMAZON")
@EnableDiscoveryClient
public class AmazonApplication {
	private final static Logger logger = LoggerFactory.getLogger(AmazonApplication.class);
	public static void main(String[] args) {

		logger.info("***AmazonApplication-START");
		SpringApplication.run(AmazonApplication.class, args);
		logger.info("***AmazonApplication-END");
	}

}
