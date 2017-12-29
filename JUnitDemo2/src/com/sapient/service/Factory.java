package com.sapient.service;

public class Factory {
	
	public static CalService getCalSerive(){
		CalService cs = new CalService();
		return cs;
	}
	
	public static Palindrome getPalindromeSerive(){
		Palindrome pal = new Palindrome();
		return pal;
	}
	
	public static EmpService getEmpSerivce(){
		EmpService emp = new EmpService();
		return emp;
	}
	
	public static String[] getInput(){
		return new String[] {"amar", "vikas", "suresh", "manish", "shubham", "rajendra", "rajendra", 
								"keshav", "rahul", "janit", "jay", "harmann", "praveen", "ganesh", "afzal",
								"amarnath", "sourabh", "vasu", "varun", "sai"};
		
	}
}
