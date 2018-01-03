package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class RepeatTest {
	
	@RepeatedTest(5)
	public void test1(){
		Palindrome obj = new Palindrome();
		assertTrue(obj.checkPalindrome("nitin"));
	}
}
