package com.celebrityApp.celebrity_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class CelebrityApiApplication {
	//asdw

	public static void main(String[] args) {
		SpringApplication.run(CelebrityApiApplication.class, args);
	}

}
