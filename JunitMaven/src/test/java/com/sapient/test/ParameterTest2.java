package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalSerivce;

@RunWith(JUnitPlatform.class)
public class ParameterTest2 {
	
	@ParameterizedTest
	@CsvSource({"5,5,10,10.0", "5,5,5,7.5"})
	public void testSeries(int a, int b, int c, double expected){
		CalSerivce ser = new CalSerivce();
		double actual = ser.calSeries(a, b, c);
		assertEquals(expected, actual);
	}
}
