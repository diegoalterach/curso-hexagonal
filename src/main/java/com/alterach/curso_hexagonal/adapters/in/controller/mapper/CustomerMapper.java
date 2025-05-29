package com.alterach.curso_hexagonal.adapters.in.controller.mapper;

import com.alterach.curso_hexagonal.adapters.in.controller.request.CustomerRequest;
import com.alterach.curso_hexagonal.adapters.in.controller.response.CustomerResponse;
import com.alterach.curso_hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCostumer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customerRequest);
}
