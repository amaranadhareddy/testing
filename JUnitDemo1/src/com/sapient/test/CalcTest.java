package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalSerivce;

@RunWith(JUnitPlatform.class)
public class CalcTest {
	private static CalSerivce ser;

	@BeforeAll
	public static void beforeAll(){
		ser = new CalSerivce();
		System.out.println("before all");
	}

	@AfterAll
	public static void afterAll(){
		System.out.println("after all");
		ser = null;
	}
	
	@BeforeEach
	public void before(){
		System.out.println("before");
	}
	
	@AfterEach
	public void after(){
		System.out.println("after");
	}
	
	/*@BeforeAll
	public static void beforeAll2(){
		System.out.println("before all2");
	}*/
	@Tag("prod")
	@Tag("dev")

	@Test
	public void seriesTest1(){
		System.out.println("test 1");
		double expected = 10.0;
		double actual = ser.calSeries(5, 5, 10);
		assertEquals(expected, actual);
	}
	@Tag("dev")
	@Test
	public void seriesTest2(){
		System.out.println("test 2");
		double expected = 7.5;
		double actual = ser.calSeries(5, 5, 5);
		assertEquals(expected, actual);
	}
}
