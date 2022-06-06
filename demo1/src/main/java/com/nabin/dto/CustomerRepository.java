package com.nabin.dto;

public class CustomerRepository {

	private int count;
	public String createCustomer() {
		
		return "new customer created";
	}

	public String fetchCustomer(int count) {
		return "The count is" + count;
	}

}
