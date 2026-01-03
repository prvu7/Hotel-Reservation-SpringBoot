package org.prvu.hotelreservationsystem.repository;

import org.prvu.hotelreservationsystem.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findByGuestName(String guestName);
}
