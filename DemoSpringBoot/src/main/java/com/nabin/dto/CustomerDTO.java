package com.nabin.dto;

public class CustomerDTO {
	
	private String address;
	
	private  String name;
	
	private String email;
	
	private long phoneNo;
	
	
	

	public CustomerDTO() {
		super();
		
	}
	
	
	public CustomerDTO(String address, String name, String email, long phoneNo) {
		super();
		this.address = address;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	
	

}
