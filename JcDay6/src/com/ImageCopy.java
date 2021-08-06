package com;

import java.io.*;

public class ImageCopy {
	public static boolean copyImage(File file) {
		try {
			String[] arr = file.getName().split("\\.");
			FileInputStream fis = new FileInputStream(file);
			if(!arr[1].equals("png")) {
				throw new Exception();
			}
			BufferedInputStream bis = new BufferedInputStream(fis);
			File copied = new File(file.getName() + "_copy.png");
			FileOutputStream fos = new FileOutputStream(copied);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write((char)data);
			}
			fis.close();
			bos.close();
			bis.close();
			return true;
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			return false;
		}catch(Exception e) {
			System.out.println("File format not supported");
			return false;
		}
		
		
	}

}
