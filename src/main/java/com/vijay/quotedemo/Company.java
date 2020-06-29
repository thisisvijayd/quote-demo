package com.vijay.quotedemo;

public class Company{
	 
	 
	public Company(String cname, int i) {
		// TODO Auto-generated constructor stub
		this.companyName = cname;
		this.stockPrice = i;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	private String companyName;
	private int stockPrice;

}
