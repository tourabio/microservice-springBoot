/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.CarReservation;
import com.esprit.microservice.repository.CarReservationRepository;

@Service
public class CarReservationService{
	@Autowired
	private CarReservationRepository repository;

	public CarReservation addCarReservation(CarReservation reservation) {

		return repository.save(reservation);

	}

	public List<CarReservation> getAllCarReservations() {

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

	public CarReservation updateCarReservation(int id, CarReservation reservation) {

		if (repository.findById(id).isPresent()) {
			CarReservation existingReservation = repository.findById(id).get();
			existingReservation.setCarNumber(reservation.getCarNumber());
			existingReservation.setCarType(reservation.getCarType());
			existingReservation.setId(reservation.getId());
			existingReservation.setUserCIN(reservation.getUserCIN());

			return repository.save(existingReservation);
		}
		else
			return null;

	}

}
