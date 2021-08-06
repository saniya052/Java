package com;

public class OrderServiceUtil {
	static Order[] order = new Order[3];
	static int count = 0;
	
	public static void addOrder(Order o1) {
		if(!o1.getCustomerName().equals("Invalid")) {
			order[count] = o1;
			count++;
		}
		
	}
	
	public static Order searchOrder(int orderId) {
		for(int i=0 ; i<count ; i++) {
			if(order[i].getOrderId() == orderId) {
				return order[i];
			}
		}
		return null;
	}
	
	public static float findTotal() {
		return count;
	}
}
