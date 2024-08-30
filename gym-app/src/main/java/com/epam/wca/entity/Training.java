package com.epam.wca.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "trainings")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Training {

    @Id
    @Column(name = "training_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "trainee_id")
    private Trainee traineeId;

    @Column(name = "trainer_id")
    private Trainer trainerId;

    @Column(name = "training_name")
    private String trainingName;

    @Column(name = "training_type")
    private TrainingType trainingType;

    @Column(name = "training_date")
    private Integer trainingDate;

    @Column(name = "training_duration")
    private Integer trainingDuration;



    @ManyToOne
    @JoinColumn(name = "trainee_id")
    private Trainee trainee;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "training_type")
    private TrainingType trainingTypes;
}
