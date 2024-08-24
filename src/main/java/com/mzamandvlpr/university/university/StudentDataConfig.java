package com.mzamandvlpr.university.university;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDataConfig {
    @Bean
     CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args ->{
            Student Bappy = new Student(
                  102L,
                    "MD",
                    "Maniruzzaman",
                   "bappy@gmail.com",
                    22
            );
            studentRepository.save(Bappy);
        };
    }

}

