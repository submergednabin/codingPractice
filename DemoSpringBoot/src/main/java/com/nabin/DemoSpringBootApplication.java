package com.nabin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.nabin.service.CustomerServiceImpl;

@SpringBootApplication
public class DemoSpringBootApplication {
	
	public static void main(String[] args) throws Exception {
		CustomerServiceImpl service = null;
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(DemoSpringBootApplication.class, args);
		service = (CustomerServiceImpl) context.getBean("customerService");
		service.fetchCustomer();
		context.close();
//		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		EmployeeService emp = context.getBean(EmployeeService.class);
//		emp.display();
		
//		AbstractApplicationContext context = (AbstractApplicationContext) 
//				SpringApplication.run(DemoSpringBootApplication.class, args);
//		/* Development Environment */
//		CustomerDev service = (CustomerDev) context.getBean("CustomerDev");
//		service.insertCustomerDev();
//		context.close();
//		CustomerServiceImpl service = null;
//		AbstractApplicationContext context = (AbstractApplicationContext)
//		SpringApplication.run(DemoSpringBootApplication.class, args);
//		
//		service = (CustomerServiceImpl) context.getBean("customerService");
//		service.deleteCustomer(1151212222l);
//		List<CustomerDTO> listcust = service.fetchCustomer();
//		System.out.println("phoneNumber" + "  " + "Name" + "  " + "Email" + "  "+ "Address");
//		
//		for(CustomerDTO customerDTO2 : listcust) {
//			System.out.format("%5d%10s%20s%10s", customerDTO2.getPhoneNo(), customerDTO2.getName(), customerDTO2.getEmail(), customerDTO2.getAddress());
//			System.out.println();
//		}
//		
		
		
	}
	


}
