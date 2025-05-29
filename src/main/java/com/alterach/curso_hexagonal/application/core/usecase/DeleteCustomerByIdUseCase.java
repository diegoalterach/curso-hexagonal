package com.alterach.curso_hexagonal.application.core.usecase;

import com.alterach.curso_hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.alterach.curso_hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.alterach.curso_hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    @Autowired
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;


    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
