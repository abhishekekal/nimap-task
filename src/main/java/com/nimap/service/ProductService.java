package com.nimap.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.nimap.Repository.ProductRepository;

@Configuration
@ComponentScan("com.nimap")
@Repository
public class ProductService {
	
	@Bean
	public ProductRepository productRepository() {
		return new productRepositoryImpl();
	}

}
