package com.alos.barbershop.utils;

import com.alos.barbershop.domain.Barbershop;

import static com.alos.barbershop.utils.AvailabilityUtils.createAvailability;

public class BarbershopUtils {

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
