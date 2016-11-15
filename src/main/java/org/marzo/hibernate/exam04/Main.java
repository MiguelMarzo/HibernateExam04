package org.marzo.hibernate.exam04;

import org.hibernate.Session;
import org.marzo.hibernate.exam04.dao.FlightDAO;
import org.marzo.hibernate.exam04.models.Passenger;
import org.marzo.hibernate.exam04.models.Flight;

public class Main {

	public static void main(String[] args) {
		Flight flight = new Flight();
		flight.setName("Flight 1");
		
		
		Passenger passenger1 = new Passenger();
		passenger1.setName("Passenger A");
		passenger1.setPhone("999");
		
		Passenger passenger2 = new Passenger();
		passenger2.setName("Passenger B");
		passenger2.setPhone("444");
		
		flight.getPassengers().add(passenger1);
		flight.getPassengers().add(passenger2);
		
		FlightDAO flightDAO = new FlightDAO();
		flightDAO.insert(flight);

		flightDAO.selectById(1l).toString();
		System.out.println("END");
		


	}

}
