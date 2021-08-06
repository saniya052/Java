package com;
import java.util.*;

public class Patients implements Comparable<Patients> {
 private int patientId;
 private String name;
 private int age;

public Patients( int patientId, String name, int age) {
	super();
	this.patientId = patientId;
	this.name = name;
	this.age = age;
}

public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static void getAgeOfPatient(String name) {
	
}

@Override
public int compareTo(Patients o1) {
	return this.getAge()-o1.getAge();
}


/*public String toString() {
	return "Patients [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
}
*/
 
}
