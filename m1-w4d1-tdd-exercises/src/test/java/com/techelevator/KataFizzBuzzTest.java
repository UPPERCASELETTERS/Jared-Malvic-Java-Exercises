package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	KataFizzBuzz sut = new KataFizzBuzz();
	
	@Test
	public void testPrint1() {		
		assertEquals("1", sut.fizzBuzz(1) );
	}
	
	@Test
	public void testPrint3() {		
		assertEquals("Fizz", sut.fizzBuzz(3));
	}
	
	@Test
	public void testPrint5() {
		assertEquals("Buzz", sut.fizzBuzz(5));
	}
	
	@Test
	public void testMulitpleOf3() {
		assertEquals("Fizz", sut.fizzBuzz(33));
	}

	@Test
	public void testMulitpleOf5() {
		assertEquals("Buzz", sut.fizzBuzz(55));
	}
	
	@Test
	public void testMultipleOfBoth() {
		assertEquals("FizzBuzz",sut.fizzBuzz(45));
	}
	
	@Test 
	public void testHas3NotDivisbleBy3() {
		assertEquals("Fizz", sut.fizzBuzz(13));
	}
	
	@Test 
	public void testHas5NotDivisbleBy5() {
		assertEquals("Fizz", sut.fizzBuzz(51));
	}
	
	@Test
	public void testZero() {
		assertEquals("", sut.fizzBuzz(0));
	}
	
	@Test
	public void testLessThanZero() {
		assertEquals("", sut.fizzBuzz(-1));
	}
	
	@Test
	public void test100() {
		assertEquals("Buzz", sut.fizzBuzz(100));
	}
	
	@Test
	public void testGreaterThan100() {
		assertEquals("", sut.fizzBuzz(101));
	}
}
