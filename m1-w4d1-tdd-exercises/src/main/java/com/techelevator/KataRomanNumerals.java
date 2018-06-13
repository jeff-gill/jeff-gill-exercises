package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KataRomanNumerals {

	public TreeMap<Integer, String> arabicToRoman = new TreeMap<Integer, String>();
	{

		arabicToRoman.put(1000, "M");
		arabicToRoman.put(900, "CM");
		arabicToRoman.put(500, "D");
		arabicToRoman.put(100, "C");
		arabicToRoman.put(50, "L");
		arabicToRoman.put(10, "X");
		arabicToRoman.put(5, "V");
		arabicToRoman.put(1, "I");
		arabicToRoman.put(0, "");
	}

	public String toRoman(int arabicNumber) {
		int roman = arabicToRoman.floorKey(arabicNumber);
		if (arabicNumber == roman) {
			return arabicToRoman.get(arabicNumber);
		}
		return arabicToRoman.get(roman) + toRoman(arabicNumber - roman);
	}

	private static final Map<Character, Integer> romanToArabic = new HashMap<Character, Integer>();
	static {
		romanToArabic.put('I', 1);
		romanToArabic.put('V', 5);
		romanToArabic.put('X', 10);
		romanToArabic.put('L', 50);
		romanToArabic.put('C', 100);
		romanToArabic.put('D', 500);
		romanToArabic.put('M', 1000);
	}
	 
	public int romanToInt(String s) {
	    int sum = 0;
	    int len = s.length() - 1;
	    for (int i = 0; i < len; i++) {
	        if (romanToArabic.get(s.charAt(i)) < romanToArabic.get(s.charAt(i + 1))) {
	            sum -= romanToArabic.get(s.charAt(i));
	        } else {
	            sum += romanToArabic.get(s.charAt(i));
	        }
	    }
	    return sum += romanToArabic.get(s.charAt(len));
	}
}