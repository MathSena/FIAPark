package com.fiap.fiapark.services;

import com.fiap.fiapark.models.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    List<Driver> findAll();

    Optional<Driver> findById(String id);

    Driver save(Driver driver);

    void deleteById(String id);

    Optional<Driver> findByName(String name);

    List<Driver> findByAddressContaining(String addressFragment);
}
