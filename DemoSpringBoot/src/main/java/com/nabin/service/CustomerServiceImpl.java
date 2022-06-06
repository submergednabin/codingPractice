package com.nabin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabin.dto.CustomerDTO;
import com.nabin.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	private static  Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String createCustomer(CustomerDTO customerDTO) {
		customerRepository.createCustomer(customerDTO);
	
		return "Customer with "  + customerDTO.getPhoneNo() + " added successfully";
		
	}

	@Override
	public List<CustomerDTO> fetchCustomer() {
		return customerRepository.fetchCustomer();
	}

	@Override
	public void deleteCustomer(long phoneNumber) throws Exception {
		try {
			customerRepository.deleteCustomer(phoneNumber);
		} catch(Exception e) {
			logger.info("In exception");
			logger.error(e.getMessage(),e);
		}
		
		
	}

	

}
