package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProverbReader {

	
	public static void main(String args[]) throws IOException {

		String toFileName = "TopProverb.txt";
		
		FileInputStream fos = new FileInputStream(toFileName);
		BufferedInputStream bfos = new BufferedInputStream(fos);	
		int i;
		while((i=bfos.read())!= -1) {
			System.out.print((char)i);
		}
		
		bfos.close();	
		fos.close();
	}
}
