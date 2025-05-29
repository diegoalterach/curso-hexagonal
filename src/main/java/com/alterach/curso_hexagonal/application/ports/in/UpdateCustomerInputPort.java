package com.alterach.curso_hexagonal.application.ports.in;

import com.alterach.curso_hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
