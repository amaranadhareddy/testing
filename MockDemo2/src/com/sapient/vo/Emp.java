package com.sapient.vo;

public class Emp {

	private int eId;
	private String eName;
	private double sal;
	public Emp(int eId, String eName, double sal){
		super();
		this.eId = eId;
		this.eName = eName;
		this.sal = sal;
	}
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public double getSal() {
		return sal;
	}
	@Override
	public boolean equals(Object arg0) {
		Emp emp = (Emp)arg0;
		if(this.eId==emp.eId && this.eName==emp.eName && this.sal==emp.sal)
			return true;
		else
			return false;
	}
	
	
}
