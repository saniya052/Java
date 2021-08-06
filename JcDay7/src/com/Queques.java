package com;
import java.util.*;

public class Queques {
	public static void main(String[] args) {
	
	 System.out.println("Queue");	
     Queue<Integer> q=new PriorityQueue<Integer>();
     
     q.add(10);
     q.add(20);
     q.add(30);
     q.add(40);
     System.out.println(q);
     System.out.println("Peek Method: " +q.peek());
     System.out.println("remove Method:  " + q.remove());
     System.out.println(q);
     System.out.println("Poll Method:  " + q.poll());
     System.out.println(q);
     System.out.println("Poll Method:  " + q.offer(80));
     System.out.println(q);
     

  

	}

}
