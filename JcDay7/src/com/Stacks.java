package com;

import java.util.*;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.println("Stack");
	     Stack<Integer> s=new Stack<Integer>();
	     
	     s.push(10);
	     s.push(20);
	     s.push(30);
	     s.push(40);
	     System.out.println(s);
	     System.out.println("Peek Method:  "+s.peek());
	     System.out.println("Push Method:  "+s.push(80));
	     System.out.println(s);
	     System.out.println("pop Method:   " +  s.pop());
	     System.out.println(s);
	}

}
