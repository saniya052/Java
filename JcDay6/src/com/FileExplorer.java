package com;

import java.io.File;

public class FileExplorer {
	public void listAll(String path) {
		File folder = new File(path);
		File[] folderList = folder.listFiles();
		for(File file : folderList) {
			System.out.println(file.getName());
			if(!file.isFile()) {
				listAll(path + "\\" + file.getName()); 
			}
		}
	}
}
