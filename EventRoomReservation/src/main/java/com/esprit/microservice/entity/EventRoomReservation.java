package com.esprit.microservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventRoomReservation {

	@Id
	@GeneratedValue
	private int id;
	private int userid;
	private String name;
	private int capacity;
	private boolean satuts;
	


	public EventRoomReservation() {
		super();
	}

	public EventRoomReservation(int id, int userid, String name, int capacity, boolean satuts) {
		super();
		this.id = id;
		this.userid = userid;
		this.name = name;
		this.capacity = capacity;
		this.satuts = satuts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isSatuts() {
		return satuts;
	}

	public void setSatuts(boolean satuts) {
		this.satuts = satuts;
	}
	
	
	
	
}
