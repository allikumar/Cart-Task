package com.cart.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Customer-Details")
public class Customer {
	
	@Id
	private int id;
	private String customername;
	private String customerEmail;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customername;
	}
	public void setCustomerName(String customername) {
		this.customername = customername;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	public Customer(int id, String customername, String customerEmail) {
		super();
		this.id = id;
		this.customername = customername;
		this.customerEmail = customerEmail;
		
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
