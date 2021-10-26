package com.esprit.microservice.entity;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class FlightReservation implements Serializable {
	
	@Id
	@GeneratedValue
	private int Id;
	private int IdClient;
	private int NumVol;
	private String DateVol;
	private String HeureVol;
	private String ClassVol;
	private String Destination;
	private String Depart;
	
	public FlightReservation() {
		super();
	}
	
	public FlightReservation(int id, int idClient, int numVol, String dateVol, String heureVol, String classVol1,
			String destination, String depart) {
		super();
		Id = id;
		IdClient = idClient;
		NumVol = numVol;
		DateVol = dateVol;
		HeureVol = heureVol;
		ClassVol = classVol1;
		Destination = destination;
		Depart = depart;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdClient() {
		return IdClient;
	}
	public void setIdClient(int idClient) {
		IdClient = idClient;
	}
	public int getNumVol() {
		return NumVol;
	}
	public void setNumVol(int numVol) {
		NumVol = numVol;
	}
	public String getDateVol() {
		return DateVol;
	}
	public void setDateVol(String dateVol) {
		DateVol = dateVol;
	}
	public String getHeureVol() {
		return HeureVol;
	}
	public void setHeureVol(String heureVol) {
		HeureVol = heureVol;
	}
	public String getClassVol() {
		return ClassVol;
	}
	public void setClassVol(String classVol1) {
		ClassVol = classVol1;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getDepart() {
		return Depart;
	}
	public void setDepart(String depart) {
		Depart = depart;
	}

}
