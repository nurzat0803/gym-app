package com.epam.wca.dao;


import com.epam.wca.entity.Training;

import java.util.List;

public interface TrainingDAO {

    public void addTraining(Training training);
    public List<Training> listTrainings();
    public Training getTrainingById(int id);
}
