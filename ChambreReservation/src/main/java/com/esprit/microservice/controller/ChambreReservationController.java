
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

import com.esprit.microservice.entity.ChambreReservation;
import com.esprit.microservice.service.ChambreReservationService;


@RestController
@RequestMapping(value = "/api/ChambreReservation")
public class ChambreReservationController {

	@Autowired
	ChambreReservationService service;


	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<ChambreReservation> createCarReservation(@RequestBody ChambreReservation chambre) {

		return new ResponseEntity<>(service.addCarReservation(chambre), HttpStatus.OK);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<ChambreReservation>> getCarReservations() {

		return new ResponseEntity<>(service.getAllCarReservations(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ChambreReservation updateCarReservation(@PathVariable(value = "id") int id, @RequestBody ChambreReservation reservation) {

		return service.updateCarReservation(id, reservation);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteCarReservation(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(service.deleteCarReservation(id), HttpStatus.OK);
	}

}
