package com;
import java.util.*;

import com.sun.jdi.InternalException;
public class m7_ass1 {
   
	
		public static void main(String[] args) {
			
			int k = 0;
			int i = 0;
			int j = 0;
			Scanner sc = new Scanner(System.in);
			try{
				 i=sc.nextInt();
			     j=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("No Input given or the input is not interger");
				e.printStackTrace();
			}

			
			try {
				k = i/j; // A
				System.out.println("Value of k : " + k);
			}catch(RuntimeException exception) {
				System.out.println("------Divide by ZERO not allowed...");
				exception.printStackTrace();
			}
		}

}
