package com.epam.wca.dao;


import com.epam.wca.entity.Trainer;

import java.util.List;

public interface TrainerDAO {

    public void addTrainer(Trainer trainer);
    public void updateTrainer(Trainer trainer);
    public List<Trainer> listTrainers();
    public Trainer getTrainerById(int id);
}
