package com;

import java.io.*;
public class SerializeCar {
	
	public static void main(String[] args) throws IOException {
		Engine engine=new Engine("1010",70000);
	    Car car = new Car("1","BMW",engine);
		
		FileOutputStream fos = new FileOutputStream("Cardata.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(car);
		oos.close();
	

		System.out.println("State of object is written in the file....");
		

	}
}
