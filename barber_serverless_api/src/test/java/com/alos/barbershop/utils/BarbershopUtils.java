package com.alos.barbershop.utils;

import com.alos.barbershop.domain.Barbershop;

import static com.alos.barbershop.utils.AvailabilityUtils.createAvailability;

public class BarbershopUtils {

    public static Barbershop createBarbershop() {
        var expectedName = "Barbearia do Alex";
        var expectedAddress = "Avenida Paulista 201";
        var expectedCity = "Piracicaba";

        var barbershop = Barbershop.builder()
                .name(expectedName)
                .address(expectedAddress)
                .city(expectedCity)
                .availability(createAvailability())
                .build();
        return barbershop;
    }
}
