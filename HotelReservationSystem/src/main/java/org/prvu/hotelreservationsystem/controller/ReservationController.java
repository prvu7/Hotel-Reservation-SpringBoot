package org.prvu.hotelreservationsystem.controller;

import org.prvu.hotelreservationsystem.model.Reservation;
import org.prvu.hotelreservationsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService service;

    @GetMapping
    public List<Reservation> getAll() {
        return service.getAllReservations();
    }

    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return service.createReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getById(@PathVariable int id) {
        return service.getReservationById(id);
    }

    // Custom endpoint
    @GetMapping("/search")
    public List<Reservation> getByGuestName(@RequestParam String name) {
        return service.getReservationsByGuest(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteReservation(id);
    }
}
