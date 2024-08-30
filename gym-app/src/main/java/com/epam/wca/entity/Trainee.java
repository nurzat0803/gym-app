package com.epam.wca.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "trainees")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trainee {

    @Id
    @Column(name = "trainee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_of_birth")
    private String dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "user_id")
    private User userId;




    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "trainees")
    private List<Training> trainings;
}
