package com.ravi.model;

import java.util.Date;
import java.util.List;

public class Flight {
	private String 			number; 
	private int 			price;
	private String 			from;
	private String 			to;
	private Date 			departureTime;
	private Date 			arrivalTime;
	private int 			seatsLeft;
	private String 			description;
	private Plane 			plane; 
	private List<Passenger> passengers;
	
	
	public Flight(String number, String from, String to, Plane plane) {
		super();
		this.number = number;
		this.from = from;
		this.to = to;
		this.plane = plane;
	}
	
	
	
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	

}
