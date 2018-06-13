package com.techelevator;

import java.util.TreeMap;

public class KataRomanNumerals {

		public TreeMap<Integer, String> arabicToRoman = new TreeMap<Integer, String>(); {

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

	    public  String toRoman(int arabicNumber) {
	        int roman =  arabicToRoman.floorKey(arabicNumber);
	        if ( arabicNumber == roman ) {
	            return arabicToRoman.get(arabicNumber);
	        }
	        return arabicToRoman.get(roman) + toRoman(arabicNumber - roman);
	    }
}

    
//	    public TreeMap<String, Integer> romanToArabic = new TreeMap<String, Integer>(); {
//
//	    	romanToArabic.put("M", 1000);
//	    	romanToArabic.put("CM", 900);
//	    	romanToArabic.put("D", 500);
//	    	romanToArabic.put("C", 100);
//	    	romanToArabic.put("L", 50);
//	    	romanToArabic.put("X", 10);
//	    	romanToArabic.put("V", 5);
//	        romanToArabic.put("I", 1);
//	        romanToArabic.put("", 0);
//	    }
//
//	    public  Integer toArabic(String i) {
//	        String arabic =  romanToArabic.floorKey(i);
//	        if ( i == arabic ) {
//	            return romanToArabic.get(i);
//	        }
//		return romanToArabic.get(arabic) + (toArabic(Integer.parseInt(i)) - (Integer.parseInt(arabic)));
//	    }
//
//		public String toArabic(int parseInt) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
        