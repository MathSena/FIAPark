package com.fiap.fiapark.controller;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.findAll();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable String id) {
        return driverService.findById(id).orElse(null);
    }

    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.save(driver);
    }

    @PutMapping("/{id}")
    public Driver updateDriver(@PathVariable String id, @RequestBody Driver driver) {
        if (driverService.findById(id).isPresent()) {
            return driverService.save(driver);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable String id) {
        driverService.deleteById(id);
    }
}
