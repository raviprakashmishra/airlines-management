package com.ravi.model;

public class Passenger {
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private String phone; // Phone numbers must be unique
	public String getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
}
