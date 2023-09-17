package com.fiap.fiapark.services.impl;

import com.fiap.fiapark.models.PaymentMethod;
import com.fiap.fiapark.models.enums.PaymentType;
import com.fiap.fiapark.repositories.PaymentMethodRepository;
import com.fiap.fiapark.services.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<PaymentMethod> findAll() {
        return paymentMethodRepository.findAll();
    }

    @Override
    public Optional<PaymentMethod> findById(Long id) {
        return paymentMethodRepository.findById(id);
    }

    @Override
    public PaymentMethod save(PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public void deleteById(Long id) {
        paymentMethodRepository.deleteById(id);
    }

    @Override
    public List<PaymentMethod> findByType(PaymentType type) {
        return paymentMethodRepository.findByType(type);
    }

    @Override
    public List<PaymentMethod> findByDetailsContaining(String detailsFragment) {
        return paymentMethodRepository.findByDetailsContaining(detailsFragment);
    }
}
