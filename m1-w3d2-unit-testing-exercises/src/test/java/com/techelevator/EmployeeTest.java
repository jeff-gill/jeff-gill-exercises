package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee1;

	@Before

	public void setup() {
		employee1 = new Employee(1234, "Bob", "Smith", 40000.00);
	}

	@Test
	public void verify_employee_id_is_set() {
		Assert.assertEquals(1234, employee1.getEmployeeId());
	}

	@Test
	public void verify_first_name_is_set() {
		Assert.assertEquals("Bob", employee1.FirstName());
	}

	@Test
	public void verify_last_name_is_set() {
		Assert.assertEquals("Smith", employee1.LastName());
	}

	@Test
	public void verify_annual_salary_is_set() {
		Assert.assertEquals(40000.00, employee1.getAnnualSalary(), 0);
	}

	@Test
	public void verify_full_name_is_correct() {
		Assert.assertEquals("Smith, Bob", employee1.FullName());
	}

	
}
