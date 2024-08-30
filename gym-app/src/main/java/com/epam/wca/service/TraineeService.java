package com.epam.wca.service;


import com.epam.wca.entity.Trainee;

import java.util.List;

public interface TraineeService {

    public void addTrainee(Trainee trainee);
    public void updateTrainee(Trainee trainee);
    public List<Trainee> listTrainees();
    public Trainee getTraineeById(int id);
    public void removeTrainee(int id);
}
