package com.alterach.curso_hexagonal.application.core.usecase;

import com.alterach.curso_hexagonal.application.core.domain.Customer;
import com.alterach.curso_hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.alterach.curso_hexagonal.application.ports.out.FindAddressBuZipCodeOutputPort;
import com.alterach.curso_hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressBuZipCodeOutputPort findAddressBuZipCodeOutputPort;
    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressBuZipCodeOutputPort findAddressBuZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressBuZipCodeOutputPort = findAddressBuZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCustomerByIdUseCase.find(customer.getId());
        var address = findAddressBuZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
