package org.marzo.hibernate.exam04.models;

public class Passenger {

	private long id;
	private String name;
	private String phone;

	public Passenger() {

	}

	public Passenger(long id, String title, String phone) {
		this.id = id;
		this.name = title;
		this.phone = phone;
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

	public void setName(String title) {
		this.name = title;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Pasenger [id=" + id + ", title=" + name + ", phone=" + phone + "]";
	}

}
