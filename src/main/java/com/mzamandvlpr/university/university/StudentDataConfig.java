package com.mzamandvlpr.university.university;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

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
            Student Rony = new Student(
                    103L,
                    "MD",
                    "Rony",
                    "rony@gmail.com",
                    23
            );
            Student Mamun = new Student(
                    104L,
                    "MD",
                    "Mamun",
                    "mamun@gmail.com",
                    24
            );
            studentRepository.saveAll(List.of(Bappy, Rony, Mamun));
        };
    }

}

