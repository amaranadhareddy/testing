package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalService;
import com.sapient.service.Factory;

@RunWith(JUnitPlatform.class)
public class CalcTest {

	@Test
	public void testSeries1(){
		CalService ser = Factory.getCalSerive();
		assumeTrue(ser != null);
		assertEquals(7.5, ser.calSeries(5, 5, 5));
	}
	
	@Test
	public void testSeries2(){
		CalService ser = Factory.getCalSerive();
		assumingThat(ser != null, ()->assertEquals(7.5, ser.calSeries(5, 5, 5)));
	}
}
