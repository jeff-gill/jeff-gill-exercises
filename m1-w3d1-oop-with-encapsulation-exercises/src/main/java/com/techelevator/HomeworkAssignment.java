package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}


	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void studentGrade (((Double)this.totalMarks / (Double) this.possibleMarks) * 100) {
		if (studentGrade >= 90) {
			return "A";
		}
		else if (studentGrade >= 80) {
			return "b";
		}
		else if (studentGrade >= 70) {
			return "C";
		}
		else if (studentGrade >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
	

	
	/*
	public void studentGrade ((Double)this.totalMarks / (Double) this.possibleMarks) {
		if ((totalMarks / possibleMarks) >= ((possibleMarks / 10) * 9)) {
			this.letterGrade = (String) "A";
		}
		if (((totalMarks / possibleMarks) >= ((possibleMarks / 10) * 8)) && ((totalMarks / possibleMarks) < ((possibleMarks / 10) * 9))){
			this.letterGrade = (String) "B";
		} 
		if (((totalMarks / possibleMarks) >= ((possibleMarks / 10) * 8)) && ((totalMarks / possibleMarks) < ((possibleMarks / 10) * 8))){
			this.letterGrade = (String) "C";
		} 
		if (((totalMarks / possibleMarks) >= ((possibleMarks / 10) * 7)) && ((totalMarks / possibleMarks) < ((possibleMarks / 10) * 8))){
			this.letterGrade = (String) "D";
		} else {
			this.letterGrade = (String) "F";
		};
		return letterGrade;
	}
}
