package com.epam.wca.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="trainers")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trainer {

    @Id
    @Column(name = "trainer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "user_id")
    private User userId;




    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "trainers")
    private List<Training> trainings;
}



