package com.ravi.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("passengers")
public class Passenger {
	@PrimaryKey
	private UUID 				id;
	private String 				firstname;
	private String 				lastname;
	private int 				age;
	private String 				gender;
	private String 				phone; // Phone numbers must be unique
	private List<Reservation> 	reservations ;
	
	
	
	
	public Passenger(String firstname, String lastname, int age, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.id = UUID.randomUUID();
	}
	public UUID getId() {
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
	
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
}
