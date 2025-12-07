package com.parkingapp.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password; // store hashed

    private String fullName;
    private boolean hasYardParking;
    private boolean hasGarageCard;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {

    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHasGarageCard(boolean hasGarageCard) {
        this.hasGarageCard = hasGarageCard;
    }

    public void setHasYardParking(boolean hasYardParking) {
        this.hasYardParking = hasYardParking;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}