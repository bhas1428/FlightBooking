package com.bhaskar.FlightBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhaskar.FlightBookin.Model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long>{

}
