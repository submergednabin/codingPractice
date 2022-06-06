package com.test.daos;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.test.models.Employees;



@Repository
public interface EmployeeDAO {
	
	public int insertEmployee(Employees emp);
	public List<Employees> getAllEmployee();
	public int updateEmployeeById(int id , Employees emp);
	public int deleteEmployeeById(int id);
	public Optional<Employees> selectEmployeeById(int id);
	
}