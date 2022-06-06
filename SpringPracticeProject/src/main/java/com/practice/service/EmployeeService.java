package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private AddressService add;

	public void setAdd(AddressService add) {
		this.add = add;
	}

	public void display() {
		System.out.println(add.getDetails());
	}
}
