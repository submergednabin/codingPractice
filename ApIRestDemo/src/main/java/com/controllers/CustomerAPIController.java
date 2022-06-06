package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.services.CustomerServiceImpl;

@RestController
@RequestMapping(value ="/customers")
public class CustomerAPIController {
	
	private CustomerServiceImpl customerService;

	@Autowired
	public CustomerAPIController(CustomerServiceImpl customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping(value = "all")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		return ResponseEntity.status(200).body(customerService.findAllCustomer());
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable int id){
//		int ids = Integer.parseInt(id);
		Optional<Customer> c = customerService.findCustomerById(id);
		return ResponseEntity.ok(c);
	} 
	
	
	
	

}
