package com.alterach.curso_hexagonal.adapters.out.client.mapper;


import com.alterach.curso_hexagonal.adapters.out.client.response.AddressResponse;
import com.alterach.curso_hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
