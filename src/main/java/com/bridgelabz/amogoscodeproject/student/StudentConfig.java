package com.bridgelabz.amogoscodeproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ){
        return args -> {
             Student abhishek = new Student(
                     "Abhishek",
                    "abhishek.magdum.07@gmail.com",
                    23,
                    LocalDate.of(1999, Month.JUNE,8)
            );
            Student Nikhil = new Student(
                    "Nikhil",
                    "nikhilbirnale@gmail.com",
                    15,
                    LocalDate.of(2008, Month.JANUARY,28)
            );

            repository.saveAll(List.of(abhishek,Nikhil));
        };
    }
}
