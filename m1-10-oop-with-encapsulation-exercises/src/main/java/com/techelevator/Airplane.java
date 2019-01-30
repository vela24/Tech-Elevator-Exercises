package com.techelevator;

public class Airplane {
	private String planeNumber;
	private int totalFirstClassSeats;
	private int availableFirstClassSeats;
	private int bookedFirstClassSeats;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if(forFirstClass) {
			bookedFirstClassSeats += totalFirstClassSeats;
			if(totalNumberOfSeats<= getAvailableFirstClassSeats()) {
				return true;
			}
		//	totalNumberOfSeats;
		}
		if(!forFirstClass) {
			bookedCoachSeats += totalCoachSeats;
			if(totalNumberOfSeats <= getAvailableCoachSeats()) {
				return true;
				
			}
		}
		return false;
	}
	


	public String getPlaneNumber() {
		return planeNumber;
	}

//	public void setPlaneNumber(String planeNumber) {
//		this.planeNumber = planeNumber;
//	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats = bookedFirstClassSeats + availableFirstClassSeats;
	}

//	public void setTotalFirstClassSeats(int totalFirstClassSeats) {
//		this.totalFirstClassSeats = totalFirstClassSeats;
//	}

	public int getAvailableFirstClassSeats() {
		return availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
	}

	//public void setAvailableFirstClassSeats(int availableFirstClassSeats) {
	//	this.availableFirstClassSeats = availableFirstClassSeats;
	//}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

//	public void setBookedFirstClassSeats(int bookedFirstClassSeats) {
//		this.bookedFirstClassSeats = bookedFirstClassSeats;
//	}

	public int getTotalCoachSeats() {
		return totalCoachSeats = bookedCoachSeats + availableCoachSeats;
	}

//	public void setTotalCoachSeats(int totalCoachSeats) {
	//	this.totalCoachSeats = totalCoachSeats;
//	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
//	public void setBookedCoachSeats(int bookedCoachSeats) {
//		this.bookedCoachSeats = bookedCoachSeats;
//	}
	public int getAvailableCoachSeats() {
		return availableCoachSeats = totalCoachSeats - bookedCoachSeats;
	}
//	public void setAvailableCoachSeats(int availableCoachSeats) {
	//	this.availableCoachSeats = availableCoachSeats;
//	}

	


	
	

}
