package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {
	
	Television sut;

	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDefaultsWhenTurnedOn() {
		sut.turnOn();
		
		assertEquals(true, sut.isOn());
		assertEquals(3, sut.getCurrentChannel());
		assertEquals(2, sut.getCurrentVolume());
	}
	
	@Test
	public void testDefaultsWhenOff() {
		assertEquals(false, sut.isOn());
		assertEquals(3, sut.getCurrentChannel());
		assertEquals(2, sut.getCurrentVolume());
	}
	
	@Test 
	public void testTurnOn() {
		sut.turnOn();
		
		assertEquals(true, sut.isOn());
	}
	
	@Test 
	public void testTurnoff() {
		sut.turnOn();
		sut.turnOff();
		
		assertEquals(false, sut.isOn());
	}
	
	@Test
	public void testVolumeUpWhileOn() {
		sut.turnOn();
		sut.raiseVolume();
		
		int result = sut.getCurrentVolume();
		
		assertEquals(3, result);
	}
	
	@Test
	public void testVolumeUpWhileOff() {
		sut.raiseVolume();
		
		int result = sut.getCurrentVolume();
		
		assertEquals(2, result);
	}
	
	@Test
	public void testVolumeDownWhileOn() {
		sut.turnOn();
		sut.lowerVolume();
		
		int result = sut.getCurrentVolume();
		
		assertEquals(1, result);
	}
	
	@Test
	public void testVolumeDownWhileOff() {
		sut.lowerVolume();
		
		int result = sut.getCurrentVolume();
		
		assertEquals(2, result);
	}
	
	@Test
	public void testVolumeUpWhileOnAt10() {
		sut.turnOn();
		
		for(int i=0; i<10; i++) {
		sut.raiseVolume();
		}
			
		assertEquals(10, sut.getCurrentVolume());
	}
	
	@Test
	public void testVolumeUpWhileOffAt10() {
	
		for(int i=0; i<10; i++) {
		sut.raiseVolume();
		}
			
		assertEquals(2, sut.getCurrentVolume());
	}
	@Test
	public void testVolumeDownWhileOnAt0() {
		sut.turnOn();
		
		for(int i=0; i<10; i++) {
		sut.lowerVolume();
		}
			
		assertEquals(0, sut.getCurrentVolume());
	}
	
	@Test
	public void testVolumeDownWhileOffAt0() {
	
		for(int i=0; i<10; i++) {
		sut.lowerVolume();
		}
			
		assertEquals(2, sut.getCurrentVolume());
	}	
	
	@Test
	public void testChannelUpWhileOnPassed18() {
		sut.turnOn();
		
		for(int i=0; i<16; i++) {
		sut.channelUp();
		}
			
		assertEquals(3, sut.getCurrentChannel());
	}
	
	@Test
	public void testChannelUpWhileOffAt18() {
	
		for(int i=0; i<10; i++) {
		sut.channelUp();
		}
			
		assertEquals(3, sut.getCurrentChannel());
	}
	@Test
	public void testChannelDownWhileOnPassed0() {
		sut.turnOn();		
		
		sut.channelDown();		
			
		assertEquals(18, sut.getCurrentChannel());
	}
	
	@Test
	public void testChannelDownWhileOffAt0() {
	
		for(int i=0; i<10; i++) {
		sut.channelDown();
		}
			
		assertEquals(3, sut.getCurrentChannel());
	}

}
