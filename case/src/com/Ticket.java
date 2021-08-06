package com;


import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.*;

public class Ticket {
	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger,Integer> passengers = new TreeMap<>();
	
	public Ticket(LocalDate travelDate, Train train) {
		if(travelDate.isBefore(LocalDate.now())) {
			System.out.println("Travel Date is before current date");
			System.exit(0);
		}
		this.travelDate = travelDate;
		this.train = train;
	}
	
	public String generatePNR() throws IOException {
		StringBuilder sb = new StringBuilder("");
		File file = new File("counter.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data = 0;
		while((data = bis.read()) != -1) {
			sb.append((char)data);
		}
		bis.close();
		counter = Integer.parseInt(sb.toString());
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
	
	public double calcPassengerFare(Passenger passenger) {
		double fare = this.getTrain().getTicketPrice();
		if(passenger.getAge() <= 12) {
			fare = fare/2;
		}else if(passenger.getAge() >= 60 ) {
			fare = fare*(3/5);
		}else {
			if(passenger.getGender() == 'F') {
				fare = fare*(3/4);
			}
		}
		return fare;
	}
	
	public void addPassenger(String name, int age, char gender) {
		Passenger passenger = new Passenger(name, age, gender);
		double fare = calcPassengerFare(passenger);
		this.passengers.put(passenger, (int)fare);
		
	}
	
	public double calculateTotalTicketPrice() {
		double total = 0;
		for(Passenger passenger : this.passengers.keySet()) {
			total += this.passengers.get(passenger);
		}
		return total;
	}
	
	public StringBuilder generateTicket() throws IOException {
		StringBuilder sb = new StringBuilder("");
		sb.append("PNR: " + this.generatePNR() + "\n");
		sb.append("Train No: " + this.train.getTrainNo() + "\n");
		sb.append("Train Name: " + this.train.getTrainName() + "\n");
		sb.append("From:" + this.train.getSource() + "\n");
		sb.append("To: " + this.train.getDestination() + "\n");
		sb.append("Travel Date: " + this.travelDate.getDayOfMonth() + "/" + this.travelDate.getMonthValue() + "/" + this.travelDate.getYear() + "\n\n");
		sb.append("Passengers" + "\n");
		sb.append("Name\tAge\tGender\tFare\n");
		for(Passenger passenger : this.passengers.keySet()) {
			sb.append(passenger.getName() + "\t" + passenger.getAge() + "\t" + passenger.getGender() + "\t" + this.passengers.get(passenger) + "\n");
		}
		sb.append("Total Price: " + this.calculateTotalTicketPrice()); 
		return sb;
	}
	
	public void writeTicket() throws IOException {
		String str = this.generateTicket().toString();
		String fileName = this.pnr + ".txt";
		FileOutputStream fos = new FileOutputStream(fileName);
		PrintWriter pr = new PrintWriter(fos);
		pr.write(str);
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

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Integer> getPassengers() {
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
		this.passengers = passengers;
	}


}
