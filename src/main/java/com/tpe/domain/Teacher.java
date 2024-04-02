package com.tpe.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotNull(message = "name can not be null")
    @NotBlank(message = "name can not be space")
    @Size(min=2,max=25)
    private String name;

    @Column(nullable = false)
    @NotNull(message = "surname can not be null")
    @NotBlank(message = "surname can not be space")
    @Size(min=2,max=25)
    private String surname;

    @Size(min=2,max = 25)
    private String branch;

    @Email
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String phone;





}
