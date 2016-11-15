package org.marzo.hibernate.exam04.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Flight {

	private long id;
	private String name;
	private Date date;
	private List<Passenger> passengers = new ArrayList<Passenger>();

	public Flight() {

	}

	public Flight(long id, String name, Date date, List<Passenger> passengers) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.passengers = passengers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
