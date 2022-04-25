package com.ecomm.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.ecomm.common.entity"})
public class EcommBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommBackEndApplication.class, args);
	}

}
