package com.fiap.fiapark.services;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.models.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    List<Vehicle> findAll();

    Optional<Vehicle> findById(Long id);

    Vehicle save(Vehicle vehicle);

    void deleteById(Long id);

    List<Vehicle> findByBrand(String brand);

    List<Vehicle> findByColor(String color);

    Optional<Vehicle> findByLicensePlate(String licensePlate);

    List<Vehicle> findByDriver(Driver driver);
}
