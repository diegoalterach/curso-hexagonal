package com.alterach.curso_hexagonal.config;

import com.alterach.curso_hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.alterach.curso_hexagonal.adapters.out.UpdateCustomerAdapter;
import com.alterach.curso_hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.alterach.curso_hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {


    @Bean
    public UpdateCustomerUseCase updateCustomerUserCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return new UpdateCustomerUseCase(findCustomerByIdUseCase,findAddressByZipCodeAdapter,updateCustomerAdapter);

    }
}
