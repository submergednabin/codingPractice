package com.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.daos.EmployeeDAO;
import com.test.models.Employees;

@Service
public class EmployeeService {
	
	
	private EmployeeDAO empl;
	
	@Autowired
	public EmployeeService(@Qualifier("fakeDao") EmployeeDAO empl) {
		this.empl = empl;
	}
	
	public List<Employees> getAll(){
		 return empl.getAllEmployee();
		
	}
	
	public int addEmployee(Employees emp) {
		return empl.insertEmployee(emp);
		
		
	}
	
	public Optional<Employees> selectEmployeeById(int id){
		return empl.selectEmployeeById(id);
	}
	
	public int deleteEmployee(int id) {
		return empl.deleteEmployeeById(id);
	}
	
	public int updateEmployee(int id, Employees emp) {
		return empl.updateEmployeeById(id, emp);
	}

}
