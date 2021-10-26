/*
 * Copyright (C) TALYS ™ - All Rights Reserved Unauthorized copying of this file, via any medium is
 * strictly prohibited Proprietary and confidential
 */
package com.esprit.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.microservice.entity.EventRoomReservation;
import com.esprit.microservice.repository.EventRoomReservationRepository;

@Service
public class EventRoomReservationService{
	@Autowired
	private EventRoomReservationRepository repository;

	public EventRoomReservation addEventRoomReservation(EventRoomReservation reservation) {

		return repository.save(reservation);

	}

	public List<EventRoomReservation> getAllEventRoomReservations() {

		return repository.findAll();
	}

	public String deleteEventRoomReservation(int id) {

		if (repository.findById(id).isPresent()) {
			repository.deleteById(id);
			return "Reservation deleted!";
		}
		else
			return " There is no reservation to be deleted!";
	}

	public EventRoomReservation updateEventRoomReservation(int id, EventRoomReservation reservation) {

		if (repository.findById(id).isPresent()) {
			EventRoomReservation existingReservation = repository.findById(id).get();
			existingReservation.setId(reservation.getId());
			existingReservation.setUserid(reservation.getUserid());
			existingReservation.setName(reservation.getName());
			existingReservation.setCapacity(reservation.getCapacity());
			existingReservation.setSatuts(reservation.isSatuts());

			return repository.save(existingReservation);
		}
		else
			return null;

	}

}
