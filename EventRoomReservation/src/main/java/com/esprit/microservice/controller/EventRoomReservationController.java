
package com.esprit.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.microservice.entity.EventRoomReservation;
import com.esprit.microservice.service.EventRoomReservationService;

@RestController
@RequestMapping(value = "/api/EventRoomReservation")
public class EventRoomReservationController {

	@Autowired
	EventRoomReservationService service;


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<EventRoomReservation> createEventRoomReservation(@RequestBody EventRoomReservation reservation) {

		return new ResponseEntity<>(service.addEventRoomReservation(reservation), HttpStatus.OK);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<EventRoomReservation>> getEventRoomReservations(@RequestBody EventRoomReservation reservation) {

		return new ResponseEntity<>(service.getAllEventRoomReservations(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public EventRoomReservation updateEventRoomReservation(@PathVariable(value = "id") int id, @RequestBody EventRoomReservation reservation) {

		return service.updateEventRoomReservation(id, reservation);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteEventRoomReservation(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(service.deleteEventRoomReservation(id), HttpStatus.OK);
	}

}
