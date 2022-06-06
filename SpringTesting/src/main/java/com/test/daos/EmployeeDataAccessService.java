package com.test.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.JmsProperties.Listener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.test.models.Employees;

@Repository("postgres")
public class EmployeeDataAccessService implements EmployeeDAO {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public EmployeeDataAccessService(JdbcTemplate jdbcTemplate) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int insertEmployee(Employees emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employees> getAllEmployee() {
		// TODO Auto-generated method stub
		final String sql = "SELECT * FROM employees";
		List<Employees> emp = jdbcTemplate.query(sql, (resultSet , i) ->
		{
			int id = resultSet.getInt("emp_id");
			String name =  resultSet.getString("name");
			String address = resultSet.getString("phone_number");
			long phone_number = resultSet.getLong("phone_number");
			return new Employees(id, name, phone_number, address);
		});
		return emp;
	}

	@Override
	public int updateEmployeeById(int id, Employees emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Employees> selectEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
