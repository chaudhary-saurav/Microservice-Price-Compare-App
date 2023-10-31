package com.api.flipkart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.api.flipkart")
public class FlipkartApplication {
	private final static Logger logger = LoggerFactory.getLogger(FlipkartApplication.class);
	public static void main(String[] args) {

		logger.info("***FlipkartApplication-START");
		SpringApplication.run(FlipkartApplication.class, args);
		logger.info("***FlipkartApplication-END");

	}


}
