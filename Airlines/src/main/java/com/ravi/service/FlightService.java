package com.ravi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ravi.customqueries.CustomFlightQueries;
import com.ravi.model.Flight;

@Service
public class FlightService {
	@Autowired
	CustomFlightQueries query;
	public List<Flight> getFlight(String to, String from){
		return query.seachFlights(to, from);
	}

}
