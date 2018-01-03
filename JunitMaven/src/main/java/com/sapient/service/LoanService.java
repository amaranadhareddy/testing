package com.sapient.service;

public class LoanService {

		public String approveLoan(int age, double income)throws AgeException, IncomeException{
			if(age<20 || age>40){
				throw new AgeException("age must be greater than 20");
			}
			if(income<400000){
				throw new IncomeException("income must be greater than 40000");
			}
			
			
			return "approved";
		}
}
