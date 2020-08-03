INSERT INTO 
	TBL_FLIGHTS (source_City, destination_city, travel_Date, 
		flight_Number,
		airline_Name, departure, arrivalTime,no_OfStops,price
	) 
VALUES
  	('Hyderabad', 'Bangalore', ,STR_TO_DATE('02-05-2018', '%m-%d-%Y'),
  		'IAA1','IndianAirline','2020-02-05 03:14:07','2020-02-05 03:14:07',"twohours",
  		'2',13000
  	);
  	
  	
  	

   source_City VARCHAR(250) NOT NULL,
  destination_city VARCHAR(250) NOT NULL,
  travel_Date date DEFAULT NULL,
   flight_Number VARCHAR(250) NOT NULL,
   airline_Name VARCHAR(250) NOT NULL,
   departure TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   arrivalTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   duration VARCHAR(250) NOT NULL,
   no_OfStops VARCHAR(250) NOT NULL,
   price INT 