package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KataRomanNumeralsTest {
	
	KataRomanNumerals toRoman;
	KataRomanNumerals romanToArabic;
	
	
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
	
	@Test
	public void return_MMDCCLXV_if_the_number_is_1001() {
		Assert.assertEquals("MMDCCLXV", toRoman.toRoman(2765));
	}
	
	/////////////////////////
	
	@Before
	public void setup2() {
		romanToArabic = new KataRomanNumerals();
		}
	
	@Test
	public void return_1_if_the_numer_is_i() {
		Assert.assertEquals(1, romanToArabic.romanToInt("I"));
	}

	@Test
	public void return_5_if_the_number_is_v() {
		Assert.assertEquals(5, romanToArabic.romanToInt("V"));
	}
	
	@Test
	public void return_10_if_the_number_is_x() {
		Assert.assertEquals(10, romanToArabic.romanToInt("X"));
	}

	@Test
	public void return_50_if_the_number_is_l() {
		Assert.assertEquals(50, romanToArabic.romanToInt("L"));
	}
	
	@Test
	public void return_100_if_the_number_is_c() {
		Assert.assertEquals(100, romanToArabic.romanToInt("C"));
	}
	
	@Test
	public void return_500_if_the_number_is_d() {
		Assert.assertEquals(500, romanToArabic.romanToInt("D"));
	}
	
	@Test
	public void return_1000_if_the_number_is_m() {
		Assert.assertEquals(1000, romanToArabic.romanToInt("M"));
	}
	
	@Test
	public void return_1001_if_the_number_is_mi() {
		Assert.assertEquals(1001, romanToArabic.romanToInt("MI"));
	}
	
	@Test
	public void return_2765_if_the_number_is_MMDCCLXV() {
		Assert.assertEquals(2765, romanToArabic.romanToInt("MMDCCLXV"));
	}
}