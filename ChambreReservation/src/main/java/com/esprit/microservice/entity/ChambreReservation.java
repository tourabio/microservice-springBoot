package com.esprit.microservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChambreReservation {

	@Id
	@GeneratedValue
	private int id;
	private String chambreNumber;
	private int clientCIN;
	private String chambreClasse;
	
	
	public ChambreReservation() {
		super();
	}


	public ChambreReservation(int id, String chambreNumber, int clientCIN, String chambreClasse) {
		super();
		this.id = id;
		this.chambreNumber = chambreNumber;
		this.clientCIN = clientCIN;
		this.chambreClasse = chambreClasse;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getChambreNumber() {
		return chambreNumber;
	}


	public void setChambreNumber(String chambreNumber) {
		this.chambreNumber = chambreNumber;
	}


	public int getClientCIN() {
		return clientCIN;
	}


	public void setClientCIN(int clientCIN) {
		this.clientCIN = clientCIN;
	}


	public String getChambreClasse() {
		return chambreClasse;
	}


	public void setChambreClasse(String chambreClasse) {
		this.chambreClasse = chambreClasse;
	}

	
	
	
}
