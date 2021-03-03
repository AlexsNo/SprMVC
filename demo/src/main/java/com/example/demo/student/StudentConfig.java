package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
                    Student Sanek = new Student(1L,
                            "Sanek",
                            LocalDate.of(1994,7,11),
                            "ggg@gmail.com");
                    Student Nekit = new Student(2L,
                            "Nekit",
                            LocalDate.of(1994,7,11),
                            "ggg@gmail.com");
                    repository.saveAll(
                            List.of(Sanek,Nekit)
                    );


        };
    }
}
