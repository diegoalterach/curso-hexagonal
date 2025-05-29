package com.alterach.curso_hexagonal.application.ports.in;

import com.alterach.curso_hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
