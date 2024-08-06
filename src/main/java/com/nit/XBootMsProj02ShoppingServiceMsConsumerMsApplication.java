package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class XBootMsProj02ShoppingServiceMsConsumerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(XBootMsProj02ShoppingServiceMsConsumerMsApplication.class, args);
	}

}
