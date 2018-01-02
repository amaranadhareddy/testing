package com.sapient.vo;

import java.util.List;

public class Product {

	private int prodId;
	private String prodName;
	private double price;
	private List<String> specList;
	
	public Product(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	
	public List<String> getSpecList() {
		return specList;
	}

	public void setSpecList(List<String> specList) {
		this.specList = specList;
	}
	
	public int getProdId() {
		return prodId;
	}
	
	public String getProdName() {
		return prodName;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		Product prod = (Product) obj;
		if(this.prodId ==  prod.prodId && this.prodName.equals(prod.getProdName()) &&
				this.getPrice() == prod.getPrice() && this.getSpecList().equals(prod.getSpecList()))
			return true;
		else 
			return false;
	}
	
}
