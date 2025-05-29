package com.alterach.curso_hexagonal.config;

import com.alterach.curso_hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.alterach.curso_hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.alterach.curso_hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {


    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUserCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
           DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);

    } 
}
