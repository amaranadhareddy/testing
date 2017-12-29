package com.sapient.vo;

public class Emp {
	
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSal() {
		return sal;
	}
	public Emp(int empId, String empName, double sal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
	}
	private double sal;
	@Override
	public boolean equals(Object arg0) {
		Emp emp = (Emp) arg0;
		if(this.empId == emp.empId && this.empName.equals(emp.empName) && this.sal == emp.sal)
			return true;
		else
			return false;
	}
	
	
	
}
