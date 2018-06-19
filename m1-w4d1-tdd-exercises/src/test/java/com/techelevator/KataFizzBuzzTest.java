package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {

	KataFizzBuzz fizzBuzz;
<<<<<<< HEAD

=======
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Before
	public void setup() {
		fizzBuzz = new KataFizzBuzz();
	}
<<<<<<< HEAD

=======
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Test
	public void return_empty_string_for_numbers_out_of_range() {
		Assert.assertEquals("", fizzBuzz.fizzBuzz(0));
		Assert.assertEquals("", fizzBuzz.fizzBuzz(101));
	}
<<<<<<< HEAD

=======
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Test
	public void return_number_if_not_divisible_or_contains_3_or_5() {
		Assert.assertEquals("1", fizzBuzz.fizzBuzz(1));
		Assert.assertEquals("44", fizzBuzz.fizzBuzz(44));
		Assert.assertEquals("98", fizzBuzz.fizzBuzz(98));
	}
<<<<<<< HEAD

=======
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Test
	public void return_fizz_for_multiples_of_3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(42));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(99));
	}
<<<<<<< HEAD

	@Test
	public void return_fizz_for_multiples_of_5() {
=======
	
	@Test
	public void return_buzz_for_multiples_of_5() {
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(70));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(100));
	}
<<<<<<< HEAD

	@Test
	public void return_fizz_for_multiples_of_3_and_5() {
=======
	
	@Test
	public void return_fizzbuzz_for_multiples_of_3_and_5() {
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(60));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
	}
<<<<<<< HEAD

=======
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Test
	public void return_fizz_if_contains_3() {
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(13));
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(43));
<<<<<<< HEAD
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(43));
	}

=======
		Assert.assertEquals("Fizz", fizzBuzz.fizzBuzz(83));
	}
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	@Test
	public void return_fizz_if_contains_5() {
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(52));
		Assert.assertEquals("Buzz", fizzBuzz.fizzBuzz(58));
	}
<<<<<<< HEAD

	@Test
=======
	
	@Test 
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	public void return_fizzbuzz_if_multiple_of_3_and_contains_5() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(51));
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(54));
	}
<<<<<<< HEAD

	@Test
	public void return_fizzbuzz_if_multiple_of_5_and_contains_3() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(35));

	}
}
=======
	
	@Test 
	public void return_fizzbuzz_if_multiple_of_5_and_contains_3() {
		Assert.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(35));
	}
}
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
