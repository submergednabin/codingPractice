package com.nabin.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public EmployeeService employeeServ() {
		return new EmployeeService();
//		EmployeeService e = new EmployeeSe rvice();
//		e.setAdd(add());
//		return e;
	}
	
	@Bean
	public  AddressService add(){
		return new AddressService ();
	}
}
