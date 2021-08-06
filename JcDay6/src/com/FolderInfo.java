package com;
import java.io.File;
import java.io.IOException;
import java.lang.*;
public class FolderInfo {
 
	static void printDirectory(String path) {
		//System.out.println();
		File f1=new File(path);
		if(!f1.exists()) {
			System.out.println("No folder exists with given name.");
		}else {
			String[] parts = path.split("/");
			String filename;
			if(parts.length>0)
			    filename= parts[parts.length-1];
			
			
			String folder="" ;
			System.out.println("File:"+parts[parts.length-1]);
			
			for(int i=0;i<parts.length-1;i++) {
			     folder+=parts[i]+"/";
			}
			System.out.println("Folder:"+folder);
			System.out.println("Absoulte path:"+path);
			
		}
		
		
		
	}
	
	public static void main(String args[]) {
		
		printDirectory("D:/java/JcDay6/Badminton/Double.txt");
	}
}
