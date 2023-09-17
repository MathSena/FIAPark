package com.fiap.fiapark.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "vehicles")
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "License plate is required.")
    private String licensePlate;

    @NotBlank(message = "Model is required.")
    private String model;

    @NotBlank(message = "Brand is required.")
    private String brand;

    @NotBlank(message = "Color is required.")
    private String color;

    private int manufactureYear;

    @NotBlank(message = "Vehicle type is required.")
    private String vehicleType;

    @NotBlank(message = "Chassis number is required.")
    private String chassisNumber;

    private String description;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    public Vehicle(String licensePlate, String model, String brand, String color,
                   int manufactureYear, String vehicleType, String chassisNumber, String description) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.manufactureYear = manufactureYear;
        this.vehicleType = vehicleType;
        this.chassisNumber = chassisNumber;
        this.description = description;
    }
}