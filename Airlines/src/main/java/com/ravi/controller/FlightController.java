package com.ravi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.model.Flight;
import com.ravi.service.FlightService;

@RestController
public class FlightController {
	@Autowired
	FlightService service;
	
	public List<Flight> searchFlights(String from, String to) {
		return service.getFlight(to, from);
	}
	
}
