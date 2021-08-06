package com;

import java.io.File;
import java.util.Scanner;

public class TestImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter image file path:");
		File file = new File(sc.nextLine());
		if(ImageCopy.copyImage(file)) {
			System.out.println("Image copied successfully");
		}else {
			System.out.println("Image copy Unsuccessful");
		}
		

	}
}
