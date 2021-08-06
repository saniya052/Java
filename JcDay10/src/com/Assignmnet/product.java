package com.Assignmnet;

public class product {
	private int prod_code1;
	private String  prod_name;
	private int  prod_price;
	private String  prod_catg;
	
	
	public product(int prod_code1, String prod_name, int prod_price, String prod_catg) {
		super();
		this.prod_code1 = prod_code1;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_catg = prod_catg;
	}
	
	public int getProd_code1() {
		return prod_code1;
	}
	public void setProd_code1(int prod_code1) {
		this.prod_code1 = prod_code1;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public String getProd_catg() {
		return prod_catg;
	}
	public void setProd_catg(String prod_catg) {
		this.prod_catg = prod_catg;
	}
     
     
}
