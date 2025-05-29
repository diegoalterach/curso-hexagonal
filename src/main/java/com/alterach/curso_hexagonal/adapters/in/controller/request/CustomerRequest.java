package com.alterach.curso_hexagonal.adapters.in.controller.request;

import com.alterach.curso_hexagonal.adapters.out.repository.entity.AddressEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String cpf;
}
