package com.ravi.cassandra;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.ravi.model.Passenger;


public interface PassengerRepository extends CrudRepository<Passenger, UUID>{

}
