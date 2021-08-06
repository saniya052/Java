package com;

import java.io.*;
import java.util.*;

public class DocumentFormatter {

	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("ExtraSpace.txt");
	    try(BufferedReader br = new BufferedReader(new FileReader(file)); 
	            FileWriter fw = new FileWriter("ExtraSpaces_Removed.txt")) {
	        String st;
	        while((st = br.readLine()) != null){
	            fw.write(st.replaceAll("\\s+", " ").trim().concat("\n"));
	        }
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = sc.nextLine();
		//String fileName="D:\\java\\JcDay6\\ExtraSpace.txt";
		File file = new File("ExtraSpace.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int data = 0;
		StringBuilder sb = new StringBuilder("");
		while((data = br.read()) != -1) {
			sb.append((char)data);
			if(data == 32) {
				while((data = br.read()) == 32) {
					continue;
				}
				sb.append((char)data);
			}else if(data == 10) {
				String str = sb.toString();
				FileOutputStream fos = new FileOutputStream(fileName,true);
				PrintWriter pr = new PrintWriter(fos);
				pr.write(str);
				pr.close();
				sb = new StringBuilder("");
			}
			
		}
		String str = sb.toString();
		FileOutputStream fos = new FileOutputStream(fileName,true);
		PrintWriter pr = new PrintWriter(fos);
		pr.write(str);
		pr.close();
		
		br.close();
*/

	}
}
