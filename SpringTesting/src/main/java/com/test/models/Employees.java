package com.test.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String name;
	private long phoneNumber;
	private String address;
	
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int empId, String name, long phoneNumber, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Employees(String name, long phoneNumber, String address) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
	
	
	
	
	
	
}
