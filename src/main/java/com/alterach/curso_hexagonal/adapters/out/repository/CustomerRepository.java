package com.alterach.curso_hexagonal.adapters.out.repository;

import com.alterach.curso_hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity,String> {
}
