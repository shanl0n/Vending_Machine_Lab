package com.codebase.machine;

import com.codebase.products.Product;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Drawer extends ArrayList<Drawer> {
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
		return this.code;
	}

	public double getPrice() {
		return this.price;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public Product removeProduct() {
		return this.products.remove(0);
	}

//	@Override
//	public Stream<Drawer> stream() {
//		return super.stream();
//	}
}
