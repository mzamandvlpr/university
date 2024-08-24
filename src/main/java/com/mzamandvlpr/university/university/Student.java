package com.mzamandvlpr.university.university;

import jakarta.persistence.Column;
import  jakarta.persistence.Entity;
import jakarta.persistence.Id;
import  jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table (name = "student", schema = "university")
public class Student {
   @Id
   @Column(name="student-id", updatable = false)
   AUTO 
           private Long id;

   @Column(
           name="first_name",
           nullable = false,
           columnDefinition = "Text"

   )
    private  String firstName;

   @Column(
           name="last_name",
           nullable = false,
           columnDefinition = "Text"
   )
    private  String lastName;

   @Column(
           name="email_address",
           nullable = false,
           columnDefinition = "Text"

   )
    private  String email;

   @Column(
           name="Age",
           nullable = false
   )
    private Integer age;


}
