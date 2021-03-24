package com.alos.barbershop.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomerTest {

    @Test
    void whenCustomerPropertiesAreGivenThenItShouldBeCreated() {
        var expectedName = "Alex Rossi";
        var expectedEmail = "Alex@email.com";
        var expectedPhone = "(11)11111-1111";

        var customer = Customer.of(expectedName, expectedEmail, expectedPhone);

        assertThat(customer.getName(), equalTo(expectedName));
        assertThat(customer.getEmail(), equalTo(expectedEmail));
        assertThat(customer.getPhone(), equalTo(expectedPhone));
    }
}
