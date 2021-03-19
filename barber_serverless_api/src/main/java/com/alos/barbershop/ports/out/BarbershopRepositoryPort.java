package com.alos.barbershop.ports.out;

import com.alos.barbershop.domain.Barbershop;

import java.util.Optional;

public interface BarbershopRepositoryPort {

    Optional<Barbershop> load(String barbershopName);

    Barbershop save(Barbershop barbershop);

}
