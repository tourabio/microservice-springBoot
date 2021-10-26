package com.esprit.reservation;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Reservation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	public Reservation(String restau, String tablee, String  timestamp) {
		super();

		this.restau = restau;
		this.tablee = tablee;
		this.timestamp = timestamp;
	}
	
	public Reservation() {
		super();
	}
	@Id
	@GeneratedValue
	private int id;
	private String restau, tablee;
	private String timestamp;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestau() {
		return restau;
	}

	public void setRestau(String restau) {
		this.restau = restau;
	}

	public String getTable() {
		return tablee;
	}

	public void setTable(String tablee) {
		this.tablee = tablee;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	
}
