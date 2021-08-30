package com.bhn.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EntityScan("com.bhn.model")
@SpringBootApplication
@ComponentScan("com.bhn")
@EnableMongoRepositories("com.bhn.repository")
public class BHNmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BHNmain.class, args);
	}

}
