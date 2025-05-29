package com.alterach.curso_hexagonal.adapters.out;

import com.alterach.curso_hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.alterach.curso_hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.alterach.curso_hexagonal.adapters.out.client.response.AddressResponse;
import com.alterach.curso_hexagonal.application.core.domain.Address;
import com.alterach.curso_hexagonal.application.ports.out.FindAddressBuZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressBuZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
