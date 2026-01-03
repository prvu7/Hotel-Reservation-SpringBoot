package org.prvu.hotelreservationsystem.service;

import org.prvu.hotelreservationsystem.model.Reservation;
import org.prvu.hotelreservationsystem.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired // Injects the repository so we can use it
    private ReservationRepository repository;

    // 1. Get All
    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }

    // 2. Create New
    public Reservation createReservation(Reservation reservation) {
        // Simple business logic: Ensure price is positive
        if (reservation.getPricePerNight() < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        return repository.save(reservation);
    }

    // 3. Get by ID
    public Reservation getReservationById(int id) {
        return repository.findById(id).orElse(null);
    }

    // 4. Custom: Find by Guest Name
    public List<Reservation> getReservationsByGuest(String name) {
        return repository.findByGuestName(name);
    }

    // 5. Delete
    public void deleteReservation(int id) {
        repository.deleteById(id);
    }
}
