package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			
			Student Mariam = new Student("Mariam","mariam@gmail.com",LocalDate.of(2000, Month.JANUARY, 5));
			Student Alex = new Student("Alex","alex@gmail.com",LocalDate.of(1996, Month.APRIL, 5));
			
			repository.saveAll(List.of(Mariam,Alex));
			
		};
	}

}
