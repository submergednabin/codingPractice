package com.test.daos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.test.models.Employees;

@Repository("fakeDao")
public class EmployeeDaoImpl implements EmployeeDAO {
	
	private static List<Employees> DB = new ArrayList<>();
	@Override
	public int insertEmployee(Employees emp) {
		int empId = emp.getEmpId();
		String name = emp.getName();
		long phoneNumber = emp.getPhoneNumber();
		String address = emp.getAddress();
		DB.add(new Employees(empId, name, phoneNumber, address));
		return 1;
	}

	@Override
	public List<Employees> getAllEmployee() {
		return DB;

	}
	
	@Override
	public int updateEmployeeById(int id, Employees emp) {
		
		return selectEmployeeById(id)
				.map(p -> {
					int indexOfEmployeeToUpdate = DB.indexOf(p);
					if(indexOfEmployeeToUpdate >= 0) {
						DB.set(indexOfEmployeeToUpdate, emp);
						return 1;
					}
					return 0;
				})
				.orElse(0);
		
	}
	
	@Override
	public int deleteEmployeeById(int id) {
		Optional<Employees> emp = selectEmployeeById(id);
		if (emp.isPresent()) {
			DB.remove(emp.get());
			return 1;
			
		}else {
			return 0;
		}
	}
	
	@Override
	public Optional<Employees> selectEmployeeById(int id){
		return DB.stream()
				.filter(emp -> emp.getEmpId()==id)
				.findFirst();
	}

}
