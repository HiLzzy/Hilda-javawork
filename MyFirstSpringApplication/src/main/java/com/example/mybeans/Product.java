package com.example.mybeans;

public class Product {
	String name;


	public Product(String name) {
		super();
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Product [name=" + name + "]";

	}
}
