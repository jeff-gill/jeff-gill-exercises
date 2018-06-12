package com.techelevator.postage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PostalServiceTest {
	
	private PostalService packageA;

	@Before
	public void setup() {
		packageA = new PostalService("1stClass", 19);
		
	}
	
	
}