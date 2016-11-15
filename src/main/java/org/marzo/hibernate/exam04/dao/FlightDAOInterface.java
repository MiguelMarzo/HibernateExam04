package org.marzo.hibernate.exam04.dao;

import java.util.List;

import org.marzo.hibernate.exam04.models.Flight;

public interface FlightDAOInterface {
	
	public Flight selectById(Long id);
	public List<Flight> selectAll ();
	public void insert (Flight flight);
	public void update (Flight flight);
	public void delete (Flight flight);

}
