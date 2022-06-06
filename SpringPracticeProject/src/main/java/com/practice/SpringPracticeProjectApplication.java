package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.service.EmployeeService;
import com.practice.util.Config;

//@SpringBootApplication

public class SpringPracticeProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config
				.class);
		EmployeeService emp = context.getBean(EmployeeService.class);
		emp.display();
	}

}
