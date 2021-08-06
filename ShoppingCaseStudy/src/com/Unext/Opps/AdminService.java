package com.Unext.Opps;

import java.util.Scanner;

public interface AdminService {
// Add CRUD, search methods such as add, modify, delete, retrieve and search
	
void product_add();
void product_modify();
void product_delete();
void product_retrieve();
void product_search();
	
}

class productMain implements AdminService {

	@Override
	public void product_add() {
		int productId = 0;
		String productName = null;
		String productDescription = null;
		int price = 0;
		int quantity = 0;
		String category = null;
		Scanner sc =new Scanner(System.in);
		productId=sc.nextInt();
		productName =sc.next();
		productDescription=sc.next();
		price=sc.nextInt();
		quantity=sc.nextInt();
		category=sc.next();
		
	//	Product[] p=new Product();
		Product p =new Product(productId, productName, productDescription, price,quantity,category);
	}

	public void product_modify(Product p) {
		int productId = 0;
		String productName = null;
		String productDescription = null;
		int price = 0;
		int quantity = 0;
		String category = null;
		
		Scanner sc =new Scanner(System.in);
		productId=sc.nextInt();
		productName =sc.next();
		productDescription=sc.next();
		price=sc.nextInt();
		quantity=sc.nextInt();
		category=sc.next();
		
		p.setProductId(productId);
		p.setProductName(productName);
		p.setProductDescription(productDescription);
		p.setPrice(price);
		p.setQuantity(quantity);
		p.setCategory(category);
		
	}

	public void product_delete(Product p) {
	            p=null;
		
	}


	public void product_retrieve() {
		toString();
		
	}

	@Override
	public void product_search() {
		Scanner sc =new Scanner(System.in);
		int productId = sc.nextInt();

		
	}

	@Override
	public void product_modify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void product_delete() {
		// TODO Auto-generated method stub
		
	}
	
}