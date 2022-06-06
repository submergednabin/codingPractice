package com.nabin.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.nabin.dto.CustomerDTO;

@Repository
public class CustomerRepository {
	
	List<CustomerDTO> customers = null;
	
	@PostConstruct
	public void initializer()
	{
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setAddress("Chennai");
		customerDTO.setName("Jack"); 
		customerDTO.setEmail("Jack@infy.com");
		customerDTO.setPhoneNo(9951212222l);
		customers = new ArrayList<>();
		customers.add(customerDTO);
	}

	public void createCustomer(CustomerDTO customerDTO) {
		
		customers.add(customerDTO);
	}

	public List<CustomerDTO> fetchCustomer() {
		return customers;
	}

	public void deleteCustomer(long phoneNumber) throws Exception {
		for(CustomerDTO customer : customers)
		{ 
			if(customer.getPhoneNo() == phoneNumber)
			{
				customers.remove(customer);
				System.out.println(customer.getName()+"of phoneNumber"+customer.getPhoneNo()+"\t got deleted successfully");
				break;
			}
			else 
				throw new Exception("Customer does not exist");
		}
		
	}

}
