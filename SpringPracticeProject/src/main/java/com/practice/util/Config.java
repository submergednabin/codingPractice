package com.practice.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.service.AddressService;
import com.practice.service.EmployeeService;

@Configuration
@ComponentScan(basePackages = "com.practice.service")
public class Config {

	@Bean
	public EmployeeService employee(){
		return new EmployeeService();
//		EmployeeService e = new EmployeeService ();
//		e.setAdd(add());
//		return e;
	}
	@Bean
	public  AddressService add(){
		return new AddressService ();
	}
	
}
