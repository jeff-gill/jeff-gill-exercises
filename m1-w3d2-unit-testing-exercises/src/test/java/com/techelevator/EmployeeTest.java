package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {

	private Employee employee1;
	private Employee employee2;

		@Before
		
		public void setup() {
			employee1 = new Employee(40000, 4);
			employee2 = new Employee(30000, 3);
		}
		
		@Test
		public void salary_correct_after_raise() {
			employee1.raiseAmount(4);
			Assert.assertEquals(44000, employee1.getAnnualSalary());
		}
}






}
//	bankAccount789.transfer(bankAccount123, new BigDecimal("25.00"));
//
//	Assert.assertEquals(new BigDecimal("75.00"), bankAccount123.getBalance());
/
