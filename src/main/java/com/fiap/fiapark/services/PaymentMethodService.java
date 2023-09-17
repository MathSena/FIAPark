package com.fiap.fiapark.services;

import com.fiap.fiapark.models.PaymentMethod;
import com.fiap.fiapark.models.enums.PaymentType;

import java.util.List;
import java.util.Optional;

public interface PaymentMethodService {
    List<PaymentMethod> findAll();

    Optional<PaymentMethod> findById(Long id);

    PaymentMethod save(PaymentMethod paymentMethod);

    void deleteById(Long id);

    List<PaymentMethod> findByType(PaymentType type);

    List<PaymentMethod> findByDetailsContaining(String detailsFragment);
}
