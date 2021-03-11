package com.quickserve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Gson getGson() {
		return new Gson();
	}
	
}
