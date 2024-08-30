package com.epam.wca.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "training_types")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class TrainingType {

    @Id
    @Column(name = "training_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "training_type_name")
    private String trainingTypeName;




    @OneToMany(mappedBy = "training_type")
    private List<Trainer> trainers;

    @OneToMany(mappedBy = "training_type")
    private List<Training> trainings;
}
