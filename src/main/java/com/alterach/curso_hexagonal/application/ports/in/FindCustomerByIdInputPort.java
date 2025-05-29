package com.alterach.curso_hexagonal.application.ports.in;

import com.alterach.curso_hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
