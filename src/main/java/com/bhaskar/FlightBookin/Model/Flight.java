package com.bhaskar.FlightBookin.Model;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity {


	private String sourceCity;
	private String  destinationCity;
	private Date travelDate;
	private String flightNumber;
	private String airlineName;
	private Timestamp departure;
	private Timestamp arrivalTime;
	private String duration;
	private String noOfStops;
	private int price;
	
	
	public Flight(String sourceCity, String destinationCity, Date travelDate, String flightNumber, String airlineName,
			Timestamp departure, Timestamp arrivalTime, String duration, String noOfStops, int price) {
		super();
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.travelDate = travelDate;
		this.flightNumber = flightNumber;
		this.airlineName = airlineName;
		this.departure = departure;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.noOfStops = noOfStops;
		this.price = price;
	}


	public String getSourceCity() {
		return sourceCity;
	}


	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}


	public Date getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public String getAirlineName() {
		return airlineName;
	}


	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}


	public Timestamp getDeparture() {
		return departure;
	}


	public void setDeparture(Timestamp departure) {
		this.departure = departure;
	}


	public Timestamp getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getNoOfStops() {
		return noOfStops;
	}


	public void setNoOfStops(String noOfStops) {
		this.noOfStops = noOfStops;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Flight [sourceCity=" + sourceCity + ", destinationCity=" + destinationCity + ", travelDate="
				+ travelDate + ", flightNumber=" + flightNumber + ", airlineName=" + airlineName + ", departure="
				+ departure + ", arrivalTime=" + arrivalTime + ", duration=" + duration + ", noOfStops=" + noOfStops
				+ ", price=" + price + "]";
	}

	
	
	
}
