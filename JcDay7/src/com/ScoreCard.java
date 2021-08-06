package com;
import java.util.*;

public class ScoreCard {
	public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
		System.out.println("How many players:");
        int listOfplayer = sc.nextInt();
        
		System.out.println("Enter runs score:");
		
		Map<String ,Integer> hm=new TreeMap<String ,Integer>();
		
		while(listOfplayer >0){
			System.out.println("Enter the Id: ");
			String a = sc.next();
			System.out.println("Enter score:  ");
			Integer b = sc.nextInt();    
	        hm.put(a,b);
	        listOfplayer--;
	        }
	        
		int highScore = 0;
		String HighScoreName = null;
		int total=0;
		
		 System.out.println("players who batted");
		 for (Map.Entry<String ,Integer> mapElement : hm.entrySet()) {
			 
	           // String key= (String)mapElement.getKey();
	            System.out.println(mapElement.getKey());
	        }
		 
		 System.out.println("Scores of the players:");
		 	 
		 for (Map.Entry<String ,Integer> mapElement : hm.entrySet()) {
			 
	            String key= (String)mapElement.getKey();
	            int value= (int)mapElement.getValue();
	            System.out.println(key + " : "+ value);
	            
	            total+=value;
	            if(highScore< value) {
	            	HighScoreName=key;
	            	highScore=value;
	            	
	            }
	            
	        }
		 System.out.println("Total Score: "+total);
		 System.out.println("Name of the highest Scorer: "+HighScoreName);
		 
		 for (Map.Entry<String ,Integer> mapElement : hm.entrySet()) {
			 
	            String key= (String)mapElement.getKey();
	            int value= (int)mapElement.getValue();
	            System.out.println("Runs Scored by "+key + " : "+ value);
	           
	        }
    }
}
