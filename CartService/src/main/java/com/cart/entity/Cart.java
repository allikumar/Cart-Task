package com.cart.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;



@Document(collection="Product-Details")
public class Cart {
@Id	
private int id;
private String product_name;
private int quantity;
private String description;
private double price;

public Cart() {
	super();
}

public Cart(int id, String product_name, int quantity, String description, double price) {
	super();
	this.id = id;
	this.product_name = product_name;
	this.quantity = quantity;
	this.description = description;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


}
