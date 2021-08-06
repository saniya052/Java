package com;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.exp.DateInvalidException;


public class Ticket  {
	
	private int counter;
	private String pnr;
	//private Date travelDate;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passanger,Integer> passangers=new TreeMap<Passanger,Integer>();

	
	
	
 Ticket( Train train, LocalDate travelDate2) throws DateInvalidException{
	 if(travelDate2.isBefore(LocalDate.now())) {
			System.out.println("Travel Date is before current date");
			System.exit(0);
		}
		this.travelDate = travelDate2;
		this.train = train;
	
    }
    
    




public String generatePNR() throws IOException{
	StringBuilder sb = new StringBuilder("");
	File file = new File("counter.txt");
	
	FileInputStream fis = new FileInputStream(file);
	BufferedInputStream bis = new BufferedInputStream(fis);
	int data = 0;
	while((data = bis.read()) != -1) {
		sb.append((char)data);
	}
	bis.close();
	//String s=sb.toString();
	//counter = Integer.parseInt(s);
	this.pnr = String.valueOf(this.getTrain().getSource().charAt(0)) + String.valueOf(this.getTrain().getDestination().charAt(0)) + "_" + this.travelDate.getYear() + String.format("%02d",this.travelDate.getMonthValue()) + String.format("%02d",this.travelDate.getDayOfMonth()) + "_" + counter;
	counter++;
	String str = String.valueOf(counter);
	System.out.println(counter + " " + str); 
	String fileName = "counter.txt";
	FileOutputStream fos = new FileOutputStream(fileName);
	PrintWriter pr = new PrintWriter(fos);
	pr.write(str);
	pr.close();
	return this.pnr;
	
}

public double calcPassangerFare(Passanger p) {

	double fare = this.getTrain().getTicketPrice();
	if(p.getAge() <= 12) {
		fare = fare*0.5;
	}else if(p.getAge() >= 60) {
		fare = fare*(0.66);
	}else {
		if(p.getGender() == "F") {
			fare = fare*(0.25);
		}
	}
	return fare;
	
}


 void addPassanger(String name,int age,String gender) {
	Passanger p1=new Passanger(name,age,gender);  
	this.passangers.put(p1,(int)calcPassangerFare(p1));

}


public double calculateTotalTicketPrice() {
	double Total=0;
	
	for(Map.Entry m :passangers.entrySet()) {
		Total +=(int) m.getValue() ;
	}
	return Total;
	
}





public StringBuilder generateTicket() throws IOException {
	StringBuilder str = new StringBuilder();
	
	str.append("PNR: " + this.generatePNR() + "\n");
	str.append("Train No: " + this.train.getTrainNo() + "\n");
	str.append("Train Name: " + this.train.getTrainName() + "\n");
	str.append("From:" + this.train.getSource() + "\n");
	str.append("To: " + this.train.getDestination() + "\n");
	str.append("Travel Date: " + this.travelDate.getDayOfMonth() + "/" + this.travelDate.getMonthValue() + "/" + this.travelDate.getYear() + "\n\n");
	str.append("Passengers" + "\n");
	str.append("Name\tAge\tGender\tFare\n");
	for( Passanger passenger : this.passangers.keySet()) {
		str.append(passenger.getName() + "\t" + passenger.getAge() + "\t" + passenger.getGender() + "\t" + this.passangers.get(passenger) + "\n");
	}
	str.append("Total Price: " + this.calculateTotalTicketPrice()); 
	//System.out.print(str);
	
	return str;
		
	
}

void writeTicket() throws IOException {
	StringBuilder str = this.generateTicket();
	String fileName = this.pnr + ".txt";
	FileOutputStream fos = new FileOutputStream(fileName);
	PrintWriter pr = new PrintWriter(fos);
	pr.write(str.toString());
	pr.close();

}





public int getCounter() {
	return counter;
}


public void setCounter(int counter) {
	this.counter = counter;
}


public String getPnr() {
	return pnr;
}


public void setPnr(String pnr) {
	this.pnr = pnr;
}


public LocalDate getTravelDate() {
	return travelDate;
}


public void setTravelDateLocal(LocalDate travelDate) {
	this.travelDate = travelDate;
}


public Train getTrain() {
	return train;
}


public void setTrain(Train train) {
	this.train = train;
}



public TreeMap<Passanger, Integer> getPassengers() {
	return passangers;
}

public void setPassengers(TreeMap<Passanger, Integer> passengers) {
	this.passangers = passengers;
}










}
