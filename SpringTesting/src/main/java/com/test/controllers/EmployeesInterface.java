package com.test.controllers;

import java.util.List;

import com.test.models.Employees;

public interface EmployeesInterface {
	public List<Employees> getAllEmployees();
	
	public void findByEmployeeId(int id);
	
	public void addEmployee(Employees employees);
	
	public boolean update(long phoneNo);
	
	public boolean delete(int id);
	
	
}
