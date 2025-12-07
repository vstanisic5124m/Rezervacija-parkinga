package com.parkingapp.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ParkingSpot spot;           //(N:1) veza !

    @ManyToOne
    private User reservedBy;        //(N:1) veza !

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdAt;

    public enum Status { ACTIVE, CANCELLED, AUTO_RELEASED }
}