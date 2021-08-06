package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ProverbReverse {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			File file = new File("TopProverb.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int data = 0;
			StringBuilder sb = new StringBuilder("");
			StringBuilder line = new StringBuilder("");
			while((data = bis.read()) != -1) {
				if(data == 32 || data == 10) {
					String rev = reverseWord(sb.toString());
					line.append(rev);
					sb = new StringBuilder("");
					if(data == 10) {
						line.append("\n");
						String proverb = line.toString();
						FileOutputStream fos = new FileOutputStream("ReverseProverbs.txt",true);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						byte[] info = proverb.getBytes();
						bos.write(info,0,proverb.length());
						bos.close();
						line = new StringBuilder("");
					}else {
						line.append(" ");
					}
					
					continue;
				}
				sb.append((char)data);
				
			}
			bis.close();
			file = new File("ReverseProverbs.txt");
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			data = 0;
			while((data = bis.read()) != -1) {
				System.out.print((char)data);
			}
			bis.close();


		}

		private static String reverseWord(String str) {
			int n = str.length();
			char[] s = new char[n];
			for(int i=n-1 ; i>=0 ; i--) {
				s[n-1-i] = str.charAt(i);
			}
			return String.valueOf(s);
	
		}
	
}
