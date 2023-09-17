package com.fiap.fiapark.controller;

import com.fiap.fiapark.models.PaymentMethod;
import com.fiap.fiapark.services.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment-methods")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @GetMapping
    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodService.findAll();
    }

    @GetMapping("/{id}")
    public PaymentMethod getPaymentMethodById(@PathVariable Long id) {
        return paymentMethodService.findById(id).orElse(null);
    }

    @PostMapping
    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        return paymentMethodService.save(paymentMethod);
    }

    @PutMapping("/{id}")
    public PaymentMethod updatePaymentMethod(@PathVariable Long id, @RequestBody PaymentMethod paymentMethod) {
        if (paymentMethodService.findById(id).isPresent()) {
            return paymentMethodService.save(paymentMethod);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePaymentMethod(@PathVariable Long id) {
        paymentMethodService.deleteById(id);
    }
}
