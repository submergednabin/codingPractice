package com.nabin.service;

import java.util.List;

import com.nabin.model.EmployeeDTO;

public interface EmployeeService {
	public void insert(EmployeeDTO emp);
	
	public void delete(int empId);
	public List<EmployeeDTO> getAllCustomer();
}
