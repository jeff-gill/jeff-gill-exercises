package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	private HomeworkAssignment homeworkAssignment;
	
//	does the correct letter grade get returned?
//	what happens when an incorrect value is given for total marks?
	
	@Before
	public void setup() {
		homeworkAssignment = new HomeworkAssignmentTest(.9, "A");
		
	}
	
	@Test
	public void verify_correct_letter_grade_is_returned() {
		//Arrange
		//Act
		String percentage = homeworkAssignment.getLetterGrade();
		//Assert
		Assert.assertEquals("The incorrect letter grade was returned", .9, percentage);
}
}