package com.sapient.service;

public class Palindrome {
	
	public boolean checkPalindrome(String str){
		if(str==null)
			return false;
		StringBuffer x = new StringBuffer(str);
		if( str.length()>0 && str.equals(x.reverse().toString()))
			return true;
		else
			return false;
	}
	
	public String[] reverseName(String[] arr){
		if(arr==null) 
			return null;
		String[] res = new String[arr.length];
		StringBuffer sb = null;
		int i =0;
		for(String str: arr){
			sb = new StringBuffer(str);
			res[i] = sb.reverse().toString();
			++i;
		}
		return res;
	}
}
