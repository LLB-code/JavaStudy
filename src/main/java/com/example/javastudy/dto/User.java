package com.example.javastudy.dto;

import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
public class User {
    @NotBlank
    private String name;
    @Min(0)
    private int age;
}
