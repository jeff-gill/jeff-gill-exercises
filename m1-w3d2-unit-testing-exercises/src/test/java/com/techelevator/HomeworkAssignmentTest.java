package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	private HomeworkAssignment myFinalExam;

	// does the correct letter grade get returned?
	// what happens when an incorrect value is given for total marks?

	@Before
	public void setup() {
		myFinalExam = new HomeworkAssignment(100);
	}

	@Test
	public void verify_correct_possible_marks() {
		// myFinalExam.getPossibleMarks(); establishied in the @Before stated
		Assert.assertEquals(95, myFinalExam.getPossibleMarks());

	}

	@Test
	public void verify_A_grade_is_returned() {
		// Arrange
		// Act
		myFinalExam.setTotalMarks(95);
		// Assert
		Assert.assertEquals("A", myFinalExam.getLetterGrade());

	}

	@Test
	public void verify_B_grade_is_returned() {
		// Arrange
		// Act
		myFinalExam.setTotalMarks(85);
		// Assert
		Assert.assertEquals("B", myFinalExam.getLetterGrade());

	}

	@Test
	public void verify_C_grade_is_returned() {
		// Arrange
		// Act
		myFinalExam.setTotalMarks(75);
		// Assert
		Assert.assertEquals("C", myFinalExam.getLetterGrade());

	}

	@Test
	public void verify_D_grade_is_returned() {
		// Arrange
		// Act
		myFinalExam.setTotalMarks(65);
		// Assert
		Assert.assertEquals("D", myFinalExam.getLetterGrade());

	}

	@Test
	public void verify_F_grade_is_returned() {
		// Arrange
		// Act
		myFinalExam.setTotalMarks(55);
		// Assert
		Assert.assertEquals("F", myFinalExam.getLetterGrade());

	}
}