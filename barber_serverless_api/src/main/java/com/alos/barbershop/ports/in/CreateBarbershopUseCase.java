package com.alos.barbershop.ports.in;

import com.alos.barbershop.ports.out.BarbershopRepositoryPort;
import com.alos.barbershop.ports.out.CreatedBarbershop;
import com.alos.barbershop.service.CreateBarbershopService;

public interface CreateBarbershopUseCase {

    CreatedBarbershop create(CreateBarbershopCommand createBarbershopCommand);

    static CreateBarbershopUseCase getInstance(BarbershopRepositoryPort barbershopRepositoryPort) {
        return new CreateBarbershopService(barbershopRepositoryPort);
    }
}
