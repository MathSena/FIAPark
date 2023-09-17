package com.fiap.fiapark.init;

import com.fiap.fiapark.models.Driver;
import com.fiap.fiapark.models.PaymentMethod;
import com.fiap.fiapark.models.Vehicle;
import com.fiap.fiapark.models.enums.PaymentType;
import com.fiap.fiapark.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private DriverService driverService;

    @Override
    public void run(String... args) throws Exception {
        createSampleData();
    }

    private void createSampleData() {
        // Criação de 5 registros de motoristas com seus veículos e métodos de pagamento.

        Driver driver1 = new Driver();
        driver1.setName("João Silva");
        driver1.setAddress("Rua A, 123");
        driver1.setContactInfo("joao@gmail.com");
        driver1.setPaymentMethod(new PaymentMethod(PaymentType.CREDIT_CARD, "1234-5678-9876-5432"));
        driver1.setVehicles(List.of(new Vehicle("ABC-1234", "Fiesta", "Ford", "Azul", 2021, "Hatchback", "1A2B3C4D5E6F7G8H9", "Carro familiar")));
        driverService.save(driver1);

        Driver driver2 = new Driver();
        driver2.setName("Maria Oliveira");
        driver2.setAddress("Rua B, 456");
        driver2.setContactInfo("maria@gmail.com");
        driver2.setPaymentMethod(new PaymentMethod(PaymentType.DEBIT, "9876-5432-1234-5678"));
        driver2.setVehicles(List.of(new Vehicle("DEF-5678", "Corolla", "Toyota", "Branco", 2020, "Sedan", "9H8G7F6E5D4C3B2A1", "Carro para trabalho")));
        driverService.save(driver2);

    }
}
