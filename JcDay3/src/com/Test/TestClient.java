package com.Test;
import com.*;

public class TestClient {

	public static void main(String[] args) {
	
		Order order1 = new Order(1,"Joey",1000,"CoD");
		Order order2 = new Order(2,"Ross",2000,"Gift Card");
		Order order3 = new Order(3,"Sheldon",10,"CoD");
		
		OrderServiceUtil.addOrder(order1);
		OrderServiceUtil.addOrder(order2);
		OrderServiceUtil.addOrder(order3);
		
		for(int num=1 ; num<=3 ; num++) {
			if(OrderServiceUtil.searchOrder(num) == null) {
				System.out.println("Not found");
			}else {
				System.out.println(OrderServiceUtil.searchOrder(num).getCustomerName());
			}
		}
		
		
		System.out.println(OrderServiceUtil.findTotal());
		
	}

}