package com.alos.barbershop.ports.in;

import com.alos.barbershop.ports.out.BarbershopRepositoryPort;
import com.alos.barbershop.ports.out.BookedReservation;
import com.alos.barbershop.service.BookReservationService;

public interface BookReservationUseCase {

    BookedReservation book(BookReservationCommand bookReservationCommand);

    static BookReservationUseCase getInstance(BarbershopRepositoryPort barbershopRepositoryPort) {
        return new BookReservationService(barbershopRepositoryPort);
    }
}
