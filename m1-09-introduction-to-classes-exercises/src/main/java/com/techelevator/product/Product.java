package com.techelevator.product;

public class Product {
	private String name;
	private double price;
	private double weightInOunces;
	
	public Product() {
		
	}

	public Product(String name, double price, double weightInOunces) {
		this.name = name;
		this.price = price;
		this.weightInOunces = weightInOunces;
	}

	public String toString() {
		return "The " + name + " is " + price + " and weighs " + weightInOunces + " ounces.";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
	
	
	

	//
	// Write code here
	//
	
}
