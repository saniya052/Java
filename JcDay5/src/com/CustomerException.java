package com;

class CustomerException extends Exception {
   public CustomerException() {
	   super("ID should start with 'c' or 'C' ");
   }
   
}

class CustomerNameException extends Exception {
	   public CustomerNameException() {
		   super("Name length should be greater than 2");
	   }
	   
	}
 


class CustomerCatException extends Exception {
	   public CustomerCatException() {
		   super("Categories can be"
		   		+ "1.silver"
		   		+ "2.platinum"
		   		+ "3.golden");
	   }
	   
	}