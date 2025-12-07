package com.parkingapp.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "absences")
public class Absence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ParkingSpot spot;

    private LocalDate date;         //Ako je jedan dan odsutan samo

            // Kada je kreiran datum i ,,zahtev"
}