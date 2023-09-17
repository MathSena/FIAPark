package com.fiap.fiapark.services.impl;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.models.Vehicle;
import com.fiap.fiapark.repositories.VehicleRepository;
import com.fiap.fiapark.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    @Override
    public Optional<Vehicle> findById(Long id) {
        return vehicleRepository.findById(id);
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteById(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public List<Vehicle> findByBrand(String brand) {
        return vehicleRepository.findByBrand(brand);
    }

    @Override
    public List<Vehicle> findByColor(String color) {
        return vehicleRepository.findByColor(color);
    }

    @Override
    public Optional<Vehicle> findByLicensePlate(String licensePlate) {
        return vehicleRepository.findByLicensePlate(licensePlate);
    }

    @Override
    public List<Vehicle> findByDriver(Driver driver) {
        return vehicleRepository.findByDriver(driver);
    }
}
