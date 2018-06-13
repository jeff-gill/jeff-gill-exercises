package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals toRoman;
	KataRomanNumerals toArabic;
	
	
	@Before
	public void setup1 () {
		toRoman = new KataRomanNumerals();
	}		
	
	@Test
	public void return_empty_string_if_number_is_zero() {
		Assert.assertEquals("", toRoman.toRoman(0));
	}
	
	@Test
	public void return_i_if_the_numer_is_1() {
		Assert.assertEquals("I", toRoman.toRoman(1));
	}

	@Test
	public void return_v_if_the_number_is_5() {
		Assert.assertEquals("V", toRoman.toRoman(5));
	}
	
	@Test
	public void return_x_if_the_number_is_10() {
		Assert.assertEquals("X", toRoman.toRoman(10));
	}

	@Test
	public void return_L_if_the_number_is_50() {
		Assert.assertEquals("L", toRoman.toRoman(50));
	}
	
	@Test
	public void return_c_if_the_number_is_100() {
		Assert.assertEquals("C", toRoman.toRoman(100));
	}
	
	@Test
	public void return_d_if_the_number_is_500() {
		Assert.assertEquals("D", toRoman.toRoman(500));
	}
	
	@Test
	public void return_m_if_the_number_is_1000() {
		Assert.assertEquals("M", toRoman.toRoman(1000));
	}
	
	@Test
	public void return_mi_if_the_number_is_1001() {
		Assert.assertEquals("MI", toRoman.toRoman(1001));
	}
}