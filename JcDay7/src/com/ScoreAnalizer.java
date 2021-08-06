package com;

import java.util.LinkedList;

public class ScoreAnalizer {
	 public LinkedList<Integer> runsData=new LinkedList<Integer>();
	 public int sum=0;
	 public static int n=0,i=1;




	void addRunToList(int run){  
    	 runsData.add(run);
		 System.out.println(i+"-"+"Runs Scored: "+run);
		 i+=1;
    	 sum =run+sum;
    	 
    	 //System.out.println(sum);
    	 n=n+1;
     }
     
     int calRunRate () { 
    	 //System.out.println(sum);
    	int runRate = sum/50;
		return runRate;
		
     }
     
     
     int lowestScore() {
    	 Integer min = Integer.MAX_VALUE;
    	 for (Integer i:runsData)
    	    {
    	        if (min > i) {
    	            min = i;
    	        }
    	    }
    	 
    	    return min;
    	 
     }
     
     void displayRuns() {
    	  for(int i:runsData) {
    		  System.out.print(i+" ");
    	  }
     }
	
}
