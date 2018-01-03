package com.sapient.service;

public class CalSerivce {
	public double calSeries(int a, int b, int c){
		double res =  (double)(a+b+c)/2;
		return res;
	}
	
	public double round2N(double val, int n){
		double p = Math.pow(10, n);
		double res = Math.round(val*p)/p;
		return res;
	}
}
