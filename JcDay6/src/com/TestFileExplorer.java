package com;

import java.util.Scanner;

public class TestFileExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileExplorer fe = new FileExplorer();
		System.out.println("Enter folder path:");
		fe.listAll(sc.nextLine());

	}

}