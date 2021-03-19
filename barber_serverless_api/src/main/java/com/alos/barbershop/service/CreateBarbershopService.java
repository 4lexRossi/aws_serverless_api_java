package com.alos.barbershop.service;

import com.alos.barbershop.domain.Availability;
import com.alos.barbershop.domain.Barbershop;
import com.alos.barbershop.exception.BarbershopAlreadyRegisteredException;
import com.alos.barbershop.ports.in.AvailabilityCommand;
import com.alos.barbershop.ports.in.CreateBarbershopCommand;
import com.alos.barbershop.ports.in.CreateBarbershopUseCase;
import com.alos.barbershop.ports.out.CreatedBarbershop;
import com.alos.barbershop.ports.out.BarbershopRepositoryPort;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateBarbershopService implements CreateBarbershopUseCase {

    private BarbershopRepositoryPort barbershopRepositoryPort;

    @Override
    public CreatedBarbershop create(CreateBarbershopCommand command) {
        barbershopRepositoryPort.load(command.getName())
                .ifPresent(barbershop -> { throw new BarbershopAlreadyRegisteredException(barbershop.getName());} );

        Availability availability = createAvailability(command);
        Barbershop barbershop = createBarberhop(command, availability);

        Barbershop savedBarbershop = barbershopRepositoryPort.save(barbershop);

        return CreatedBarbershop.of(savedBarbershop);
    }

    private Availability createAvailability(CreateBarbershopCommand command) {
        AvailabilityCommand availabilityCommand = command.getAvailabilityCommand();

        Availability availability = Availability.of(availabilityCommand.getDaysOfWeek(),
                availabilityCommand.getOpenTime(),
                availabilityCommand.getCloseTime(),
                availabilityCommand.getDuration());
        return availability;
    }

    private Barbershop createBarberhop(CreateBarbershopCommand command, Availability availability) {
        return Barbershop.builder()
                .name(command.getName())
                .address(command.getAddress())
                .city(command.getCity())
                .availability(availability)
                .build();
    }
}
