package com.mav.business.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uid;

    @NotBlank(message = "First Name is mandatory")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last Name is mandatory")
    private String lastName;

    @Max(value = 120)
    @Min(value = 0)
    @NotBlank(message = "Age is mandatory")
    private int age;

    @NotBlank(message = "Gender is mandatory")
    private String gender;

}
