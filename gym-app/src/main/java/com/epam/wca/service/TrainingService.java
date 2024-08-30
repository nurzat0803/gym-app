package com.epam.wca.service;


import com.epam.wca.entity.Training;

import java.util.List;

public interface TrainingService {

    public void addTraining(Training training);
    public List<Training> listTrainings();
    public Training getTrainingById(int id);
}
