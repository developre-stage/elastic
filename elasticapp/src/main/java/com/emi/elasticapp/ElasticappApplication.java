package com.emi.elasticapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages= {"com.emi.elasticapp.web.controller"})
public class ElasticappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticappApplication.class, args);
	}
}
