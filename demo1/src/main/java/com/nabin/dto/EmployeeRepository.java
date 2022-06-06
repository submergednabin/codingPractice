package com.nabin.dto;

import java.util.List;

import com.nabin.model.EmployeeDTO;

public class EmployeeRepository {
	List<EmployeeDTO> employee = null;
	
	
	public void initializer() {
		
	}

	public void insert(EmployeeDTO emp) {
		System.out.println("successfully inserteed the employee");
		
	}

	public void delete(int empId) {
		System.out.println("Successfully Deleted");
		
	}

	public List<EmployeeDTO> fetchCustomer() {
		return employee;
	}

}
