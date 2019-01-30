package com.techelevator;

public class SPU implements DeliveryDrivers {
	public int deliveryTime = 0;
	public int weight = 0;
	public int distance = 0;
	public int rate = 0;
	
	@Override
	public double calculateRate(int distance, int weight) {
		double calculateRate = 0;
		if(deliveryTime==4) {
			calculateRate = (weight * 0.0054) * distance;
		}
		else if(deliveryTime==2) {
			calculateRate = (weight * 0.0050) * distance;
		}
		else if(deliveryTime==1) {
			calculateRate = (weight * 0.075) * distance;
		}
		return calculateRate;
		
	}
//	If four-day ground then rate = (weight * 0.0050) * distance
//		    If two-day business then rate = (weight * 0.050) * distance
//		    if next day then rate = (weight * 0.075) * distance

}
