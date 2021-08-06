package com;
import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String args[]) throws IOException {
		
		String path="D:/java/JcDay6/Badminton";
		File f0=new File(path);
		Boolean valid=f0.mkdir();
		if(valid) {
			System.out.println("Folder " + f0.getName() + " is created successfully.");
		}
		else {
			System.out.println("Folder " + f0.getName() + " is Not created.");
		}
		
			File f1=new File(path+"/Single.txt");
			File f2=new File(path+"/Duble.txt");
			if(f1.createNewFile() & f2.createNewFile()) {
				System.out.println("File " + f1.getName() + f2.getName() + " is created successfully.");
			}
			else {
				System.out.println("File " + f1.getName() + f2.getName() + " is not created .");
			
			}
			
	//////Court folder		
			String path1="D:/java/JcDay6/Badminton/court";
			File f3=new File(path1);
			f3.mkdir();		
	/////court/smash.dat		
			File f4=new File(path1+"/smash.dat");
	/////rename duble to double		
			File rename = new File(path+"/Double.txt");
			f2.renameTo(rename);
	////delete single.txt		
			f1.delete();
		}
		
	}

