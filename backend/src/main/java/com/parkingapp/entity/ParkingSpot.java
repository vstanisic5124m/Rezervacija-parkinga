package com.parkingapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_spots")

public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SpotType type;          // Napolju ili  u GARAZI

    @ManyToOne
    private User owner;             // opciono

    public Long getId() {
        return id;
    }

    public SpotType getType() {
        return type;
    }

    public User getOwner() {
        return owner;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setType(SpotType type) {
        this.type = type;
    }
}