package com.codebase.products;

public abstract class Product {
	String name;
	String brand;

	public Product(String name, String brand) {
		this.name = name;
		this.brand = brand;
	}

	public String getName() {
		return this.name;
	}

	public String getBrand() {
		return this.brand;
	}
}
