package com.epam.wca.service.serviceImpl;


import com.epam.wca.dao.TrainingDAO;
import com.epam.wca.entity.Training;
import com.epam.wca.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private TrainingDAO trainingDao;

    @Override
    public void addTraining(Training training) {
        trainingDao.addTraining(training);
    }

    @Override
    public List listTrainings() {
        return trainingDao.listTrainings();
    }

    @Override
    public Training getTrainingById(int id) {
        return trainingDao.getTrainingById(id);
    }
}

