package com.alterach.curso_hexagonal.application.core.usecase;

import com.alterach.curso_hexagonal.application.core.domain.Customer;
import com.alterach.curso_hexagonal.application.ports.in.InsertCustomerInputPort;
import com.alterach.curso_hexagonal.application.ports.out.FindAddressBuZipCodeOutputPort;
import com.alterach.curso_hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.alterach.curso_hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressBuZipCodeOutputPort findAddressBuZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressBuZipCodeOutputPort findAddressBuZipCodeOutputPort, InsertCustomerOutputPort insertCustomerOutputPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressBuZipCodeOutputPort = findAddressBuZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressBuZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
