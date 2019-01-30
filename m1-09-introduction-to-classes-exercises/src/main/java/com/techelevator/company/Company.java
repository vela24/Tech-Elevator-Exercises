package com.techelevator.company;
import java.util.Scanner;

public class Company {
	
	private String companySize;
	private double profit;
	private double revenue;
	private double expenses;
	private int numberOfEmployees;
	private String name;
	
	
	
	
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getExpenses() {
		return expenses;
	}
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getCompanySize() {
		
		if(numberOfEmployees<=50) {
			return "small";
		}
		if(numberOfEmployees>=51 && numberOfEmployees <=250) {
			return "medium";
		}
		else if(numberOfEmployees>=251) {
			return "large";
		}
		return companySize;
	}
    public double getProfit() {
    	return profit = revenue - expenses;
    }
}