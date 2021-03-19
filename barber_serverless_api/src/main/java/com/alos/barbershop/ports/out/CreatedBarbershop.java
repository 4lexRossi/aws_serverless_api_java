package com.alos.barbershop.ports.out;

import com.alos.barbershop.domain.Barbershop;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreatedBarbershop {

    private final String name;
    private final String address;
    private final String city;

    public static CreatedBarbershop of(Barbershop barbershop) {
        return new CreatedBarbershop(barbershop.getName(),
                barbershop.getAddress(),
                barbershop.getCity());
    }
}
