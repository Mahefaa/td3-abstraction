package com.td3.shop.products;

public class Product {
	protected final String id;
	protected final String name;
	protected final String description;
	protected final double unitPrice;

	public Product(String id, String name, String description, double unitPrice) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
	}
}
