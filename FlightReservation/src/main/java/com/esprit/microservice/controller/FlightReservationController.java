
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

import com.esprit.microservice.entity.FlightReservation;
import com.esprit.microservice.service.FlightReservationService;

@RestController
@RequestMapping(value = "/api/flightReservation")
public class FlightReservationController {
	private String title = "Hello,I'm the flight reservation Microservice";
	@Autowired
	FlightReservationService flightService;

	@RequestMapping("/hello")
	public String sayHello() {

		System.out.println(title);
		return title;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<FlightReservation> createFlight(@RequestBody FlightReservation a) {

		return new ResponseEntity<>(flightService.addFlight(a), HttpStatus.OK);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<FlightReservation>> getFlights() {

		return new ResponseEntity<>(flightService.getAllFlight(), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public FlightReservation updateFlight(@PathVariable(value = "id") int id, @RequestBody FlightReservation a) {

		return flightService.updateFlight(id, a);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> deleteFlight(@PathVariable(value = "id") int id) {

		return new ResponseEntity<String>(flightService.deleteFlight(id), HttpStatus.OK);
	}

}
