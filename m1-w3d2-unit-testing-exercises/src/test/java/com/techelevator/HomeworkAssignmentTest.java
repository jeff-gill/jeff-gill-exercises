package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	private HomeworkAssignment myFinalExam;

	
//	does the correct letter grade get returned?
//	what happens when an incorrect value is given for total marks?
	
	@Before
	public void setup() {
		myFinalExam = new HomeworkAssignment(100);
		
}

	@Test
	public void verify_correct_possible_is_returned() {
		//Arrange
		//Act
		myFinalExam.setTotalMarks(95);
		//Assert
		Assert.assertEquals ("A", myFinalExam.getLetterGrade());
	}
		
	}