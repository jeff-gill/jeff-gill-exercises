package com.techelevator;

import org.junit.*;
import org.junit.Assert;

public class KataPotterTest {
	
	KataPotter kataPotter = new KataPotter();
	
	KataPotter book1;
	
	@Before
	public void setup() {
		book1 = new KataPotter();
	}
		
	@Test
		public void verify_cost_of_single_book_is_8() {
			Assert.assertEquals(8,  kataPotter.potterBooks("book1"));
	}

	@Test
	public void verify_cost_of_books_is_16() {
		Assert.assertEquals(16,  kataPotter.potterBooks("book1") + kataPotter.potterBooks("book2"));
	}
	@Test
	public void verify_book_count() {
		Assert.assertEquals(1,  kataPotter.returnBookCount());
	}
}
