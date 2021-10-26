/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.ChambreReservation;
import com.esprit.microservice.repository.ChambreReservationRepository;

@Service
public class ChambreReservationService{
	@Autowired
	private ChambreReservationRepository repository;

	public ChambreReservation addCarReservation(ChambreReservation reservation) {

		return repository.save(reservation);

	}

	public List<ChambreReservation> getAllCarReservations() {

		return repository.findAll();
	}

	public String deleteCarReservation(int id) {

		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return "Reservation deleted!";
		}
		else
			return " There is no reservation to be deleted!";
	}

	public ChambreReservation updateCarReservation(int id, ChambreReservation reservation) {

		if (repository.findById(id).isPresent()) {
			ChambreReservation existingReservation = repository.findById(id).get();
			existingReservation.setChambreNumber(reservation.getChambreNumber());
			existingReservation.setChambreClasse(reservation.getChambreClasse());
			existingReservation.setId(reservation.getId());
			existingReservation.setClientCIN(reservation.getClientCIN());
			return repository.save(existingReservation);
		}
		else
			return null;

	}

}
