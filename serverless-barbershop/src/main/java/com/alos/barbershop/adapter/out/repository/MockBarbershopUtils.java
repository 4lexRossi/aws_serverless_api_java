package com.alos.barbershop.adapter.out.repository;

import static com.alos.barbershop.adapter.out.repository.MockAvailabilityUtils.createAvailability;

import com.alos.barbershop.domain.Barbershop;


public class MockBarbershopUtils {

    public static Barbershop createBarbershop() {
        var expectedName = "Barbearia do Rodrigo";
        var expectedAddress = "Avenida Paulista 201";
        var expectedCity = "São Paulo";

        var barbershop = Barbershop.builder()
                .name(expectedName)
                .address(expectedAddress)
                .city(expectedCity)
                .availability(createAvailability())
                .build();
        return barbershop;
    }
}
