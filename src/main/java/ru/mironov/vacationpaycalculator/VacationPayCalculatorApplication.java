package ru.mironov.vacationpaycalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VacationPayCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(VacationPayCalculatorApplication.class, args);
	}

}
