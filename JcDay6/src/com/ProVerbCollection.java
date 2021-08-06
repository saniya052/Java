package com;

import java.util.*;
import java.io.*;

public class ProVerbCollection {
 
	public static void storeProVerb(String verb) throws IOException {
		
		String toFileName = "TopProverb.txt";
		
		FileOutputStream fos = new FileOutputStream(toFileName,true);
		BufferedOutputStream bfos = new BufferedOutputStream(fos);		
		byte[] info = verb.getBytes();
		bfos.write(info,0,verb.length());
		bfos.close();	
	}
	
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type");
		String str;
		while(!(str = sc.nextLine()).equals("STOP")) {
			storeProVerb(str + "\n");
		}
	}
}
