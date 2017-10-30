package com.ravi.customqueries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;

import com.datastax.driver.core.querybuilder.Clause;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.ravi.model.Flight;

public class CustomFlightQueries {
	@Autowired
	CassandraTemplate temp;
	
	public List<Flight> seachFlights(String to, String from){
		Clause eq1 = QueryBuilder.eq("to", to);
		Clause eq2 = QueryBuilder.eq("from", from);
		
		
		Select select = QueryBuilder.select().from("Flight");
		select.where(eq1).and(eq2);
				  
		
		List<Flight> list = temp.select(select, Flight.class);
		return list;
	}
}
