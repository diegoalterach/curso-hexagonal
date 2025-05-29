package com.alterach.curso_hexagonal.application.ports.out;

import com.alterach.curso_hexagonal.application.core.domain.Address;

public interface FindAddressBuZipCodeOutputPort {

    Address find(String zipCode);
}
