package com.cituniversity.movieticketingsystem.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String fullName;
    private String phoneNumber;
    private LocalDate dateRegistered = LocalDate.now();

    // getters and setters
}
