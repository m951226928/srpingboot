package com.offon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;

import com.offon.model.Lianxi;


@SpringBootApplication//(exclude=org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class)
@ServletComponentScan

public class Starter{
	
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
		
		
	}

}
