package com.fiap.fiapark.repositories;

import com.fiap.fiapark.models.PaymentMethod;
import com.fiap.fiapark.models.enums.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

    List<PaymentMethod> findByType(PaymentType type);

    List<PaymentMethod> findByDetailsContaining(String detailsFragment);

}