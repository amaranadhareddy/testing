package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
/*@SelectClasses({CalcTest.class, LoanTest.class,
				PalindromeTest.class,ReverseNameTest.class,RoundTest.class})*/
@SelectPackages("com.sapient.test")
public class AllTest {

}
