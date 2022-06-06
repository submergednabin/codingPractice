package com.nabin.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nabin.dto.CustomerRepository;
import com.nabin.service.CustomerServiceImpl;

@Configuration
public class SpringConfiguration {
	
	
	@Bean //Constructor Injection
	public CustomerServiceImpl customerService() {
		return new CustomerServiceImpl(CustomerRepository(), 20);
//		CustomerServiceImpl customerService = new CustomerServiceImpl();
//		customerService.setCount(10);
//		return customerService;
	}
	
	@Bean //Constructor Injection
	public CustomerRepository CustomerRepository() {
		return new CustomerRepository();
//		CustomerRepository customerRepository = new CustomerRepository();
//		return customerRepository;
	}
	
	
}
