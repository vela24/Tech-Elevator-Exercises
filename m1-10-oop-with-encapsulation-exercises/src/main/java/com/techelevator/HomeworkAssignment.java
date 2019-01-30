package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		

		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}


	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}


	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	
	public String getLetterGrade() {
		double myMark = (((double) totalMarks/(double)possibleMarks));
	
		if(myMark>=.90) {
			this.letterGrade = "A";
		}
		else if (myMark >= .80 && myMark<=.89) {
			 this.letterGrade = "B";
		}
		else if (myMark >=.70 && myMark <= .79) {
			this.letterGrade = "C";
		}
		else if (myMark >=.60 && myMark <= .69) {
			this.letterGrade = "D";
		}
		else {
			this.letterGrade = "F";
		}
		
	
	return this.letterGrade;
		}

}

