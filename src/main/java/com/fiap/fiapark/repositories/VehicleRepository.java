package com.fiap.fiapark.repositories;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findByBrand(String brand);

    List<Vehicle> findByColor(String color);

    Optional<Vehicle> findByLicensePlate(String licensePlate);

    List<Vehicle> findByDriver(Driver driver);

}