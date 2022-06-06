package com.nabin.service;

import java.util.List;

import com.nabin.dto.CustomerDTO;

public interface CustomerService {
	
	public String createCustomer(CustomerDTO customerDTO);
	public List<CustomerDTO> fetchCustomer();
	
	public void deleteCustomer(long phoneNumber) throws Exception;
}
