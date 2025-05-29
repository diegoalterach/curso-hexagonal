package com.alterach.curso_hexagonal.application.ports.out;

import com.alterach.curso_hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
