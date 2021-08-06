package com;
import java.io.*;
import java.util.*;

public class StudentMarks {
	 public static void main(String[] args)
	    {
		
		 ArrayList<Integer> marks= new ArrayList<Integer>(5);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the no of elements:");
		 int n=sc.nextInt();
		 System.out.println("Enter the marks:");
		 for(int i=0;i<n;i++){
			int a=sc.nextInt();
			marks.add(a);
		 }
		 int Studentmarks3rd=marks.get(2);
		 
		 Collections.sort(marks);
		 
		 int last = marks.get(marks.size() - 1);
		 System.out.println("Maximume Score:  "+last);
		 int sum=0;
		 for(int i=0;i<marks.size();i++) {
			 sum += marks.get(i);
		 }
		 
		 int avgsum=sum/n;
		 System.out.println("Average Score:  "+avgsum);
		 
		 
		 System.out.println("3rd student Score:  "+Studentmarks3rd);
		 
		 System.out.print("sorted:");
		 for(int i=0;i<marks.size();i++) {
			 System.out.print(marks.get(i)+" ");
		 }
		
		 
	    }
	 
}
