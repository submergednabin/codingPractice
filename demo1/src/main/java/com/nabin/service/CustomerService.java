package com.nabin.service;

import java.util.List;

//import com.nabin.model.CustomerDTO;
import com.nabin.model.EmployeeDTO;

public interface CustomerService {
//	public String createCustomer(CustomerDTO customerDTO);
//	public List<CustomerDTO> fetchCustomer();
//	public String updateCustomer(long phoneNumber, CustomerDTO customerDTO);
//	public String deleteCustomer(long phoneNumber);
	public String createCustomer();
	public void insert(EmployeeDTO emp);
	public void delete(int empId);
	public String fetchCustomer();
}
