package org.prvu.hotelreservationsystem.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "guest_name")
    private String guestName;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "check_in_date")
    private LocalDate checkInDate;

    @Column(name = "price_per_night")
    private Double pricePerNight;
}
