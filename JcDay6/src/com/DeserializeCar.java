package com;

import java.io.*;
import java.io.Serializable;

public class DeserializeCar {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("Cardata.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car car = (Car)ois.readObject();
		System.out.println(car.getCarMake() + "\t" + ((Engine)car.getEngine()).getCubicCapacity());
	}

}
