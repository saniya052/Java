package com;
import java.util.*;
import java.lang.*;
public class TestCustomer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String custNo=sc.nextLine();
		String custName=sc.nextLine();
		String Categories=sc.nextLine();
		
		char s=custNo.charAt(0);
	 
		
		try {
				if(s !='C')
				{
					throw new CustomerException();
				}
				else if(custName.length() < 4) {
					throw new CustomerNameException();
				}
				else if(Categories=="platinum" || Categories=="silver" || Categories=="golden") {
					throw new CustomerCatException();
				}
				
			}catch(CustomerException exception) {
				exception.printStackTrace();
				//System.out.println(exception.getMessage());
			}catch(CustomerNameException exception) {
				exception.printStackTrace();
				//System.out.println(exception.getMessage());
			}catch(CustomerCatException exception) {
				exception.printStackTrace();
				//System.out.println(exception.getMessage());
			}
		
		customer c1=new customer(custNo,custName,Categories);
		System.out.println(c1);
	
		
	}

}
