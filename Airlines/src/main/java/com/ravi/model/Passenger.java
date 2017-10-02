package com.ravi.model;

public class Passenger {
	private String id;
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	private String phone; // Phone numbers must be unique
	
	
	
	
	public Passenger(String firstname, String lastname, int age, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
	}
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
