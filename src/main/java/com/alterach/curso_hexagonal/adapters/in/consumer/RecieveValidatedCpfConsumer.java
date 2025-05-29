package com.alterach.curso_hexagonal.adapters.in.consumer;

import com.alterach.curso_hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.alterach.curso_hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.alterach.curso_hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class RecieveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "alterach")
    public void recieve(CustomerMessage customerMessage){

        var customer = customerMessageMapper.toCostumer(customerMessage);

        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
