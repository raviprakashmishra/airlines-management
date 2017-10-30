package com.ravi.cassandra;

import java.util.UUID;

import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.data.repository.CrudRepository;

import com.ravi.model.Passenger;

@EnableCassandraRepositories
public interface FlightRepository extends CrudRepository<Passenger, UUID>{

}

