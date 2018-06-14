package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class KataPotter {

	public int potterBooks(String potterBookName) {
		
		if (potterBookName == null || potterBookName.length() < 1) {
			return 0;
		}
		
		Map<String, Integer> bookName = new HashMap<String, Integer>();
		bookName.put("book1", 8);
		bookName.put("book2", 8);
		bookName.put("book3", 8);
		bookName.put("book4", 8);
		bookName.put("book5", 8);
		
		Integer basket = bookName.get(potterBookName.toLowerCase());
		
		if(basket == null) {
			return 0;
		}
		
		return basket;
	}

	public int returnBookCount() {
		
		int [] basket = { };
		
		int counter = 0;
		for(int i = 0; i < basket.length; i++) {
			counter ++;
			
		}
		return counter;
		}
}
