package com.techelevator;

public class Elevator {
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	int desiredFloor;
	
	public void openDoor() {
		doorOpen=true;
		
	}
	

	public void closeDoor() {
		doorOpen = false;

	}

	public Elevator(int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
		this.currentFloor = 1;
		
		
	}


	public int getCurrentFloor() {
		return currentFloor;
	}


	public int getNumberOfFloors() {
		return numberOfFloors;
	}



	public boolean isDoorOpen() {
		
		return doorOpen;
		
	}

	
	
    public void goUp(int desiredFloor) {
    	if((desiredFloor <= this.numberOfFloors) && (desiredFloor > this.currentFloor) && this.isDoorOpen()==false) {
    		this.currentFloor = desiredFloor;
    		
    	}
    	
    }
   
    
    public void goDown(int desiredFloor) {
    	if((desiredFloor >= 1) && (desiredFloor < this.currentFloor) && this.isDoorOpen()==false) {
    		this.currentFloor = desiredFloor;
    	}
    }
	
	
	
}
