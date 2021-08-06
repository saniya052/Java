package com.Unext.Opps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

import com.*;

public class Customer {
int userId;
String emailId;
String password;
String firstName;
String lastName;
Address address;
String gender;
int  phoneNumber;
public Customer(int userId, String emailId, String password, String firstName, String lastName, Address address,
		String gender, int phoneNumber) throws InvalidNameException, PhoneException {
	
	super();
	 Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	    Matcher matcherf = pattern.matcher(firstName);
	    Matcher matcherl = pattern.matcher(lastName);
	
	 if((firstName.length() < 6) || (lastName.length() < 6) || matcherf.find() || matcherl.find()){
	        throw new InvalidNameException(" ");
	    }else{
	      this.firstName = firstName;
	      this.lastName = lastName;
	    }

	this.userId = userId;
	this.emailId = emailId;
	this.password = password;
	this.address = address;
	this.gender = gender;
	this.phoneNumber = phoneNumber;
	
	/*if(phoneNumber.length() > 10) {
		     throw new PhoneException();
	}
    else if (phoneNumber.startsWith("")){
    	 throw new PhoneException();
    }
    else {
        this.phoneNumber = phoneNumber;
    }*/
	

	
	 
	
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName)throws InvalidNameException {
	 Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	    Matcher matcherf = pattern.matcher( firstName);
	    if(( firstName.length() < 6) || matcherf.find()){
	        throw new InvalidNameException(" ");
	    }else{
	      this. firstName =  firstName;
	    }

}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) throws InvalidNameException {
	 Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	    Matcher matcherf = pattern.matcher( firstName);
	    if(( lastName.length() < 6) || matcherf.find()){
	        throw new InvalidNameException(" ");
	    }else{
	      this. lastName =  lastName;
	    }
	
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getphoneNumber() {
	return phoneNumber;
}
public void setphoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "Customer [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", address=" + address + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
}


}
