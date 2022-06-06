package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.Employees;
import com.test.services.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	
	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	@PostMapping
	public void addEmployee(@RequestBody Employees emp) {
//		System.out.println("hello to post body" + emp);
		employeeService.addEmployee(emp);
	}
	
	@GetMapping
	public List<Employees> getAllEmployees(){
		return employeeService.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public Employees getEmployeesById(@PathVariable("id") int id) {
		return employeeService.selectEmployeeById(id)
				.orElseThrow(null);
//				.orElse(null);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		 employeeService.deleteEmployee(id);
	}
	
	@PutMapping(value="/{id}")
	public void updateEmployee(@PathVariable("id") int id, @RequestBody Employees emp) {
		employeeService.updateEmployee(id, emp);
	}
//	@Autowired
//	private Environment env;
	
	
	
//	
//	@Autowired
//	public EmployeeController(EmployeeService employeeService ) {
//		super();
//		this.employeeService = employeeService;
//	}
//
//	@Override
//	@GetMapping(value="all")
//	public List<Employees> getAllEmployees() {
//		List<Employees> employees = employeeService.getAll();
//		return employees;
//	}
//
//	@Override
//	public void findByEmployeeId(int id) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void addEmployee(Employees employees) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public boolean update(long phoneNo) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean delete(int id) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
