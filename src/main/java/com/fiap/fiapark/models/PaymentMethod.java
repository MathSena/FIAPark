package com.fiap.fiapark.models;

import com.fiap.fiapark.models.enums.PaymentType;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "payment_methods")
@NoArgsConstructor
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Payment type is required.")
    @Enumerated(EnumType.STRING)
    private PaymentType type;

    private String details;

    public PaymentMethod(PaymentType type, String details) {
        this.type = type;
        this.details = details;
    }
}