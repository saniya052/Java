package com;

import java.io.File;   
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.*;

public class StatesFile {
	
	 public static void main(String[] args)throws Exception
	  {
	   LinkedHashSet<String>  StateSet = new LinkedHashSet<>();
	   
	   File f1=new File("D:/java/JcDay7/src/com/States.txt");
	   BufferedReader br = new BufferedReader(new FileReader(f1));
	   String st;
	   SortedSet<String> ts= new TreeSet<String>();
	   
	   while ((st = br.readLine()) != null) {
	     System.out.println(st);
	     StateSet.add(st);
	     ts.add(st);
	   }
	   
	     System.out.println(" ");
	     System.out.println("Size of LinkedHashMAp: "+ StateSet.size());
	     StateSet.remove("Delhi");
	    
	     Iterator<String> it=StateSet.iterator();
	     System.out.println(" ");
	     while(it.hasNext()) {
	    	 String s=it.next();
	    	// System.out.println(s);
	    	 if(s.startsWith("K")) {
	    		 System.out.println("State name Start with K : "+s);
	    	 }
	     }
	     
	     Iterator<String> s=ts.iterator();
	     System.out.println(" ");
	     System.out.println("Name of States in sorted form:");
	     while(s.hasNext()) {
	    	 
	    	 System.out.println(s.next());
	     }
	     
	     
	  }
}
