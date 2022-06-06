package com.nabin.service;

import com.nabin.dto.CustomerRepository;
import com.nabin.model.EmployeeDTO;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	private int count;
	
	public CustomerServiceImpl() {
		
	}
	
//	public void setCount(int count) {
//		this.count=count;
//	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository, int count) {
		this.customerRepository = customerRepository;
		this.count = count;
	}

	@Override
	public String createCustomer() {
		return customerRepository.createCustomer();
	}

	@Override
	public void insert(EmployeeDTO emp) {
		System.out.println("inserted");
	}

	@Override
	public void delete(int empId) {
		System.out.println("deleted");
		
	}

	@Override
	public String fetchCustomer() {
		return customerRepository.fetchCustomer(count);
	}

}
