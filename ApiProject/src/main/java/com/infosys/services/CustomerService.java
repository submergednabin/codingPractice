package com.infosys.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.daos.CustomerRepository;
import com.infosys.models.Customer;

@Service
public class CustomerService {
	
	private CustomerRepository cr;
	
	
	@Autowired
	public CustomerService(CustomerRepository cr) {
		super();
		this.cr=cr;
	}

	public List<Customer> findAllCustomer(){
		
		return cr.findAll();
	}

	public Optional<Customer> findCustomerById(int id) {
		return cr.findById(id);
	}



	public Customer addCustomers(Customer cm) {
		return cr.save(cm);
	}



	public Customer updateCustomer(int id, Customer cm) {
		Customer customer = cr.findByCustomerId(id);
		String email = cm.getEmail();
		String name = cm.getName();
		String dob = cm.getDateOfBirth();
		customer.setEmail(email);
		customer.setName(name);
		customer.setDateOfBirth(dob);
		return cr.save(customer);
		
		
		
	}

	public void deleteCustomerById(int id) {
		Customer cd = cr.findByCustomerId(id);
		if(cd != null) {
			
			cr.deleteById(id);
		}
	}


}
