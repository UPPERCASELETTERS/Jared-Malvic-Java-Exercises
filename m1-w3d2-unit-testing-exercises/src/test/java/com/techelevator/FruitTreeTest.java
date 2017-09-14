package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {
	
	FruitTree sut;

	@Before
	public void setUp() throws Exception {
		sut = new FruitTree("Apple", 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPickingFewer() {
		boolean result = sut.pickFruit(9);
		
		assertEquals(true, result);
		assertEquals(1, sut.getPiecesOfFruitLeft());
	}
	
	@Test
	public void testPickingAll() {
		boolean result = sut.pickFruit(10);
		
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}
	
	@Test
	public void testPickingGreater() {
		boolean result = sut.pickFruit(11);
		
		assertEquals(false, result);
		assertEquals(10, sut.getPiecesOfFruitLeft());
	}
	
	@Test
	public void testPicking5then5() {
		boolean result = sut.pickFruit(5);		
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		result = sut.pickFruit(5);		
		assertEquals(true, result);
		assertEquals(0, sut.getPiecesOfFruitLeft());
	}
	
	@Test
	public void testPicking5then6() {
		boolean result = sut.pickFruit(5);		
		assertEquals(true, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
		
		result = sut.pickFruit(6);		
		assertEquals(false, result);
		assertEquals(5, sut.getPiecesOfFruitLeft());
	}
	
		
	

}
