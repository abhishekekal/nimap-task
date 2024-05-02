package com.nimap.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.nimap.Repository.CategoryRepository;

@Configuration
@ComponentScan("com.nimap")
@Repository
public class Categoryservices {
	@Bean
	public CategoryRepository categoryRepository() {
		return new CategoryRepositoryImpl();
	}

	
	
}
