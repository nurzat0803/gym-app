package com.epam.wca.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "username")
    private String userName;

    @Column(name = "password_name")
    private String password;

    @Column(name = "is_active")
    private Boolean isActive;




    @OneToMany(mappedBy = "users")
    private List<Trainer> trainers;

    @OneToMany(mappedBy = "users")
    private List<Trainee> trainees;
}
