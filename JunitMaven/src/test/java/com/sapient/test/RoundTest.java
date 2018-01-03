package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalSerivce;

@RunWith(JUnitPlatform.class)
public class RoundTest {
	
	@Test
	public void testRound1(){
		CalSerivce ser = new CalSerivce();
		double expected = 56.328;
		double actual = ser.round2N(56.32768, 3);
		assertEquals(expected, actual);
	}
	
	@Test
	@Disabled
	public void testRound2(){
		CalSerivce ser = new CalSerivce();
		double expected = 56.32;
		double actual = ser.round2N(56.3248, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRound3(){
		CalSerivce ser = new CalSerivce();
		double expected = 56.33;
		double actual = ser.round2N(56.32768, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRound4(){
		CalSerivce ser = new CalSerivce();
		double expected = 56.3277;
		double actual = ser.round2N(56.32768, 4);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRound5(){
		CalSerivce ser = new CalSerivce();
		double expected = 56.0;
		double actual = ser.round2N(56.32768, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRound6(){
		CalSerivce ser = new CalSerivce();
		double expected = 57.0;
		double actual = ser.round2N(56.72768, 0);
		assertEquals(expected, actual);
	}
}
