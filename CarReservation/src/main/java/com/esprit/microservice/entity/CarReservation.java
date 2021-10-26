package com.esprit.microservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CarReservation {

	@Id
	@GeneratedValue
	private int id;
	private String carNumber;
	private int UserCIN;
	private String carType;
	
	
	public CarReservation() {
		super();
	}


	public CarReservation(int id, String carNumber, int userCIN, String carType) {
		super();
		this.id = id;
		this.carNumber = carNumber;
		UserCIN = userCIN;
		this.carType = carType;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}


	public int getUserCIN() {
		return UserCIN;
	}


	public void setUserCIN(int userCIN) {
		UserCIN = userCIN;
	}


	public String getCarType() {
		return carType;
	}


	public void setCarType(String carType) {
		this.carType = carType;
	}

	
	
	
}
