/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.FlightReservation;
import com.esprit.microservice.repository.FlightReservationRepository;


@Service
public class FlightReservationService {
	@Autowired
	private FlightReservationRepository flightRepository;

	public FlightReservation addFlight(FlightReservation a) {

		return flightRepository.save(a);

	}

	public List<FlightReservation> getAllFlight() {

		return flightRepository.findAll();
	}

	public String deleteFlight(int id) {

		if (flightRepository.findById(id).isPresent()) {
			flightRepository.deleteById(id);
			return "aero supprimé";
		}
		else
			return " aero non supprimé";
	}

	public FlightReservation updateFlight(int id, FlightReservation a) {

		if (flightRepository.findById(id).isPresent()) {
			FlightReservation existingFlight = flightRepository.findById(id).get();
			existingFlight.setId(a.getId());
			existingFlight.setIdClient(a.getIdClient());
			existingFlight.setNumVol(a.getNumVol());
			existingFlight.setDateVol(a.getDateVol());
			existingFlight.setHeureVol(a.getHeureVol());
			existingFlight.setClassVol(a.getClassVol());
			existingFlight.setDestination(a.getDestination());
			existingFlight.setDepart(a.getDepart());
			return flightRepository.save(existingFlight);
		}
		else
			return null;

	}

}
