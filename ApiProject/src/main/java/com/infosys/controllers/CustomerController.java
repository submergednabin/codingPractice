package com.infosys.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.models.Customer;
import com.infosys.services.CustomerService;


@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	private CustomerService cs;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	public CustomerController(CustomerService cs) {
		super();
		this.cs = cs;
		
	}
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		return ResponseEntity.status(200).body(cs.findAllCustomer());
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable int id){
		return ResponseEntity.status(200).body(cs.findCustomerById(id)) ;
	}
	
	
	@PostMapping(value="/add")
	public ResponseEntity<String> addCustomer(@RequestBody Customer cm){
		String succcessMessage = environment.getProperty("API.INSERT_SUCCESS");
		cs.addCustomers(cm);
		return ResponseEntity.status(201).body(succcessMessage);
		
		
	}
	
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<String> updateCustomer(@RequestBody Customer cm, @PathVariable int id){
		String email = cm.getEmail();
		String name1 = cm.getName();
		String date = cm.getDateOfBirth();
		cs.updateCustomer(id,cm);
		String updateMessage = environment.getProperty("API.UPDATE_MESSAGE");
		return ResponseEntity.status(200).body(updateMessage);
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id){
		cs.deleteCustomerById(id);
		String deleteMessage = environment.getProperty("API.DELETE_MESSAGE");
		return ResponseEntity.status(200).body(deleteMessage);
	}
	

	
}
