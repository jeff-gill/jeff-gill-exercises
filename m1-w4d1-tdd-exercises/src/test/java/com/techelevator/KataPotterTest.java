package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {
	
	KataPotter potter;
	
	@Before
	public void setup() {
		potter = new KataPotter();
		
		@Test
		public void verify_cost_of_single_book() {
			Assert.assertEquals("$8", potter.potter("$8"));
		}
	
	
	
	}

}
