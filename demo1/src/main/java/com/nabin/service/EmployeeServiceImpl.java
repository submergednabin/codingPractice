package com.nabin.service;

import java.util.List;

import com.nabin.dto.EmployeeRepository;
import com.nabin.model.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeDAO = new EmployeeRepository(); 

	@Override
	public void insert(EmployeeDTO emp) {
		employeeDAO.insert(emp);

	}

	@Override
	public void delete(int empId) {
		employeeDAO.delete(empId);

	}

	@Override
	public List<EmployeeDTO> getAllCustomer() {
		return employeeDAO.fetchCustomer();
	}

}
