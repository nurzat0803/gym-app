package com.epam.wca.dao;


import com.epam.wca.entity.Trainee;

import java.util.List;

public interface TraineeDAO {
    public void addTrainee(Trainee trainee);
    public void updateTrainee(Trainee trainee);
    public List<Trainee> listTrainees();
    public Trainee getTraineeById(int id);
    public void removeTraineeById(int id);
}
