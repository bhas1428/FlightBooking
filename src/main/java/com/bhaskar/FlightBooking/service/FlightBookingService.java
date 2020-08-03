package com.bhaskar.FlightBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhaskar.FlightBookin.Model.Flight;
import com.bhaskar.FlightBooking.exceptions.FlightNotFoundException;
import com.bhaskar.FlightBooking.repository.FlightRepository;

@Service
public class FlightBookingService {
	
	@Autowired
	FlightRepository repository;

	public List<Flight> getAllFlightList()
	{
		List<Flight> flightList=repository.findAll();
		
		if(flightList.size()>0)
		{
			return flightList;
		}else {
			return new ArrayList<Flight>();
		}
	}
	
	public Flight getFlightById(Long id) throws FlightNotFoundException
	{
		Optional<Flight> flight=repository.findById(id);
		if(flight.isPresent())
		{
			return flight.get();
		}else {
			throw new FlightNotFoundException("No flight record exist for given id");
		}
	}
	public Flight createOrUpdateFlight(Flight entity) throws FlightNotFoundException
	{
		Optional<Flight> flight=repository.findById(entity.getId());
		if(flight.isPresent())
		{
			Flight newFlight=flight.get();
			newFlight.setSourceCity(entity.getSourceCity());
			newFlight.setDestinationCity(entity.getDestinationCity());
			newFlight.setTravelDate(entity.getTravelDate());
			newFlight.setFlightNumber(entity.getFlightNumber());
			newFlight.setAirlineName(entity.getAirlineName());
			newFlight.setDeparture(entity.getDeparture());
			newFlight.setArrivalTime(entity.getArrivalTime());
			newFlight.setDuration(entity.getDuration());
			newFlight.setNoOfStops(entity.getNoOfStops());
			newFlight.setPrice(entity.getPrice());
			
			newFlight=repository.save(newFlight);
			return newFlight;
		}
		else {
			entity=repository.save(entity);
			return entity;
	}
	}
	public void deleteFlightById(Long id) throws FlightNotFoundException
	{
		 Optional<Flight> flight = repository.findById(id);
         
	        if(flight.isPresent()) 
	        {
	            repository.deleteById(id);
	        } else {
	            throw new FlightNotFoundException("No flight record exist for given id");
	        }
	    }


	}
