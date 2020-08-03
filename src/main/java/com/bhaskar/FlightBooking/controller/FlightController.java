package com.bhaskar.FlightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskar.FlightBookin.Model.Flight;
import com.bhaskar.FlightBooking.exceptions.FlightNotFoundException;
import com.bhaskar.FlightBooking.service.FlightBookingService;

@RestController
@RequestMapping(name = "/flights")
public class FlightController {

	@Autowired
	FlightBookingService service;

	@GetMapping
	public ResponseEntity<List<Flight>> getAllFlightList() {
		List<Flight> list = service.getAllFlightList();
		return new ResponseEntity<List<Flight>>(list, new HttpHeaders(), HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Flight> getFlightById(@PathVariable("id") Long id) throws FlightNotFoundException {
		Flight flight = service.getFlightById(id);
		return new ResponseEntity(flight, new HttpHeaders(), HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<Flight> createOrUpdateFlight(Flight flight) throws FlightNotFoundException {
		Flight updated = service.createOrUpdateFlight(flight);
		return new ResponseEntity<Flight>(updated, new HttpHeaders(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
    public HttpStatus deleteFlightById(@PathVariable("id") Long id) 
                                                    throws FlightNotFoundException {
        service.deleteFlightById(id);
        return HttpStatus.FORBIDDEN;
    }
}
