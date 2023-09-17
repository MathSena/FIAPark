package com.fiap.fiapark.repositories;

import com.fiap.fiapark.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {

    Optional<Driver> findByName(String name);

    List<Driver> findByAddressContaining(String addressFragment);

}
