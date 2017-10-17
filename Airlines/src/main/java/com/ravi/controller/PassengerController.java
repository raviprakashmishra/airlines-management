package com.ravi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.model.Passenger;
import com.ravi.service.PassengerService;

@RestController
public class PassengerController {

	@Autowired
	private PassengerService passengerService;
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/passenger")
	public Passenger createPassenger(@RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName,
			@RequestParam("age") int age, @RequestParam("gender") String gender) {
		Passenger passenger = passengerService.createPassenger(firstName, lastName, age, gender);
		return passenger;
	}
	
	
	 
}
