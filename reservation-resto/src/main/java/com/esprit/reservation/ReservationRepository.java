package com.esprit.reservation;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	// @Query("select c from Reservation c where c.restau like :restau")
	// public Page<Reservation> reservationByRestau(@Param("restau") String n, Pageable pageable);
	

}
