package com.ivoyant.springdemoodcassandradb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = "com.ivoyant.springdemoodcassandradb")
public class SpringdemoodcassandradbApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoodcassandradbApplication.class, args);
	}

}
