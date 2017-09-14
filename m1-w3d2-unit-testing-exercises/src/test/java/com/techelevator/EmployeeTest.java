package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee sut;

	@Before
	public void setUp() throws Exception {
		sut = new Employee(68, "Jared", "Malvic", 1000.00);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRaiseSalary() {
		sut.RaiseSalary(10);
		
		double result = sut.getAnnualSalary();
		
		assertEquals(1100, result, 0D);		
	}
	
	@Test
	public void testLowerSalary() {
		sut.RaiseSalary(-10);
		
		double result = sut.getAnnualSalary();
		
		assertEquals(900, result, 0D);		
	}
	
	@Test
	public void testFullName() {
		String result = sut.FullName();
		
		assertEquals("Malvic, Jared", result);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(68, sut.getEmployeeId());
		assertEquals("Jared", sut.FirstName());
		assertEquals("Malvic", sut.LastName());
		assertEquals(1000.00, sut.getAnnualSalary(), 0D);
	}
	

}
