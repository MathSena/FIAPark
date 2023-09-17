package com.fiap.fiapark.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required.")
    private String name;

    @NotBlank(message = "Address is required.")
    private String address;

    @NotBlank(message = "Contact info is required.")
    private String contactInfo;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Vehicle> vehicles;

    @OneToOne(cascade = CascadeType.ALL)
    private PaymentMethod paymentMethod;
}
