package com.ge.crud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@EnableJpaRepositories(basePackages="com.ge.repository.billing")
@EntityScan(basePackages = {"com.ge.model"})
@ComponentScan(basePackages = {"com.ge"})
public class Application {

	public static void main(String[] args) { 
		SpringApplication.run(Application.class, args);
	}
	

}
