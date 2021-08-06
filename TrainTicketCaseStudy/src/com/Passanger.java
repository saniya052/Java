package com;
import java.lang.Comparable;
public class Passanger implements Comparable<Passanger> {
	String name;
	int age;
	String gender;
	public Passanger(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	@Override
	public int compareTo(Passanger p) {
		return this.getName().compareTo(p.getName());
	}
	
	
}
