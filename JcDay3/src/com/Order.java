package com;

public class Order {
	private int orderId;
	private String customerName;
	private float orderAmount;
	private String paymentOption;
	
	public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
		if(orderAmount < 100 || (!paymentOption.equals("CoD") && !paymentOption.equals("Gift Card") && !paymentOption.equals("Internet Banking"))) {
			System.out.println("Validations fail");
			this.orderId = 30;
			this.customerName = " ";
			this.orderAmount = 0;
			this.paymentOption = null;
		}else {
			this.orderId = orderId;
			this.customerName = customerName;
			this.orderAmount = orderAmount;
			this.paymentOption = paymentOption;
		}
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		if(customerName.equals(" ")) {
			return "Invalid";
		}
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
}
