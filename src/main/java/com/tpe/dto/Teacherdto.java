package com.tpe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacherdto {

    @NotNull(message = "name can not be null")
    @NotBlank(message = "name can not be space")
    @Size(min=2,max=25)
    private String name;

    @NotNull(message = "surname can not be null")
    @NotBlank(message = "surname can not be space")
    @Size(min=2,max=25)
    private String surname;

    @Size(min=2,max = 25)
    private String branch;

    @Email
    private String email;

    private String phone;
}
