package com.techelevator.shoppingcart;

public class ShoppingCart {
	
	private int totalNumberOfItems ;
	private double totalAmountOwed;
	private double averagePricePerItem;
	
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(double totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	public void setAveragePricePerItem(double averagePricePerItem) {
		this.averagePricePerItem = averagePricePerItem;
	}
	
	
	public double getAveragePricePerItem() {
		return totalAmountOwed/totalNumberOfItems;
	}
    public void addItems(int numberOfItems, double pricePerItem) {
    	this.totalNumberOfItems = this.getTotalNumberOfItems() + numberOfItems ;
    			
    	this.totalAmountOwed = this.totalAmountOwed + (pricePerItem *totalNumberOfItems);
    	
    }
    public void empty() {
    	totalNumberOfItems = 0;
    	totalAmountOwed = 0;
    	averagePricePerItem = 0;
    		
    	}
    	
    }

	

	//
	// Write code here
	//
	

