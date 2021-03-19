package com.alos.barbershop.exception;

import com.alos.barbershop.domain.Customer;

public class ScheduleAlreadyReservedException extends BusinessException {

    public ScheduleAlreadyReservedException(Customer customer) {
        super(String.format("Schedule informed by customer %s is already registered", customer), 400);
    }
}
