package com.epam.wca.service;


import com.epam.wca.entity.Trainer;

import java.util.List;

public interface TrainerService {
    public void addTrainer(Trainer t);
    public void updateTrainer(Trainer t);
    public List<Trainer> listTrainers();
    public Trainer getTrainerById(int id);
}
