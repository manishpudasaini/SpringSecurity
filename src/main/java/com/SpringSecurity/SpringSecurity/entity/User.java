package com.SpringSecurity.SpringSecurity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    @Column(length = 60) //maximum length of the password should be 60
    private String password;
    private String role;
    private boolean enable = false;

}
