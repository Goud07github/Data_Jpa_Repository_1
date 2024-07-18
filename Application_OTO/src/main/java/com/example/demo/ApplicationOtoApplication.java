package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ExService;;

@SpringBootApplication
public class ApplicationOtoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ApplicationOtoApplication.class, args);
		ExService bean = context.getBean(ExService.class);

		bean.saveAll();
		//bean.getAddress();
		//bean.getDetail();
		
	}

}
