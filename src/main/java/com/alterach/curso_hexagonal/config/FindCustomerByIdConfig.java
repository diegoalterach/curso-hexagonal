package com.alterach.curso_hexagonal.config;

import com.alterach.curso_hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.alterach.curso_hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {


    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findAddressByZipCodeAdapter
    ){
        return new FindCustomerByIdUseCase(findAddressByZipCodeAdapter);

    }
}
