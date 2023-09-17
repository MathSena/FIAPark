package com.fiap.fiapark.services.impl;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.repositories.DriverRepository;
import com.fiap.fiapark.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<Driver> findById(String id) {
        return driverRepository.findById(id);
    }

    @Override
    public Driver save(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public void deleteById(String id) {
        driverRepository.deleteById(id);
    }

    @Override
    public Optional<Driver> findByName(String name) {
        return driverRepository.findByName(name);
    }

    @Override
    public List<Driver> findByAddressContaining(String addressFragment) {
        return driverRepository.findByAddressContaining(addressFragment);
    }



}
