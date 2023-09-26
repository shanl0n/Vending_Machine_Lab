package com.codebase.machine;

import com.codebase.products.Product;

import java.util.ArrayList;

public class Drawer {
	private ArrayList<Product> products;
	private final Code code;
	private double price;

	public Drawer(Code code, double price) {
		this.code = code;
		this.products = new ArrayList<Product>();
		this.price = price;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public Code getCode() {
		return code;
	}

	public double getPrice() {
		return price;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public Product removeProduct() {
		return this.products.remove(0);
	}
}
