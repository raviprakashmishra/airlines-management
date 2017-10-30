package com.ravi.customqueries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;

import com.ravi.model.Flight;

public class CustomFlightQueries {
	@Autowired
	CassandraTemplate temp;
	
	public List<Flight> seachFlights(){
		return null;
	}
}
