package com.alterach.curso_hexagonal.application.ports.out;

import com.alterach.curso_hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
