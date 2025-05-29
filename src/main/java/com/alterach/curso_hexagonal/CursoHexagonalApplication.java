package com.alterach.curso_hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CursoHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoHexagonalApplication.class, args);
	}

}
