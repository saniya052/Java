package com.Unext.Opps;

public class Admin {
int adminId;
String email;
String firstName;
String lastName;
String password;
public Admin(int adminId, String email, String firstName, String lastName, String password) {
	super();
	this.adminId = adminId;
	this.email = email;
	this.firstName = firstName;
	this.lastName = lastName;
	this.password = password;
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", password=" + password + "]";
}


}
