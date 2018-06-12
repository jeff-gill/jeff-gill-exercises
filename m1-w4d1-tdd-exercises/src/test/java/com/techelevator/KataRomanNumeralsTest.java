package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals romanNumerals;
	
	@Before
	public void setup () {
		romanNumerals = new KataRomanNumerals();
}
	
	@Test
	public void return_empty_string_if_number_is_zero() {
		Assert.assertEquals("", romanNumerals.romanNumerals(0));
	}
	
	@Test
	public void return_i_if_the_numer_is_1() {
		Assert.assertEquals("I", romanNumerals.romanNumerals(1));
	}

	@Test
	public void return_v_if_the_number_is_5() {
		Assert.assertEquals("V", romanNumerals.romanNumerals(5));
	}
	
	@Test
	public void return_x_if_the_number_is_10() {
		Assert.assertEquals("X", romanNumerals.romanNumerals(10));
	}

	@Test
	public void return_L_if_the_number_is_50() {
		Assert.assertEquals("L", romanNumerals.romanNumerals(50));
	}
	
	@Test
	public void return_c_if_the_number_is_100() {
		Assert.assertEquals("C", romanNumerals.romanNumerals(100));
	}
	
	@Test
	public void return_d_if_the_number_is_500() {
		Assert.assertEquals("D", romanNumerals.romanNumerals(500));
	}
	
	@Test
	public void return_m_if_the_number_is_1000() {
		Assert.assertEquals("M", romanNumerals.romanNumerals(1000));
	}
	
	@Test
	public void return_mi_if_the_number_if_1001() {
		Assert.assertEquals("MI", romanNumerals.romanNumerals(1001));
	}
}