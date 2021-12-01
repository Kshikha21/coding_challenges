package com.mindtree.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages="com.mindtree.music")
@EntityScan
@SpringBootApplication
@EnableJpaRepositories

public class MusicApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(MusicApplication.class, args);
		
	}}
	
	
	


