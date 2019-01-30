package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	public FruitTree (String typeOfFruit, int piecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = piecesOfFruit;
		
		
	}
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if(piecesOfFruitLeft > 0) {
			this.piecesOfFruitLeft = this.piecesOfFruitLeft - numberOfPiecesToRemove;
			return true;
		}
		else {
		
		return false;
		}
	}
	
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	


}
