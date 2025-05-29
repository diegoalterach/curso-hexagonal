package com.alterach.curso_hexagonal.config;

import com.alterach.curso_hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.alterach.curso_hexagonal.adapters.out.InsertCustomerAdapter;
import com.alterach.curso_hexagonal.adapters.out.SendCpfValidationAdapter;
import com.alterach.curso_hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {


    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter,sendCpfValidationAdapter);

    }
}
