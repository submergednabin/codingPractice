package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.CustomerRepository;
import com.model.Customer;

@Service
public class CustomerServiceImpl {
	
	private CustomerRepository api;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository api) {
		super();
		this.api=api;
	}



	public List<Customer> findAllCustomer() {
		
		return api.findAll(); 
	}



	public Optional<Customer> findCustomerById(int id) {
		
		return api.findById(id);
	}
	


}
