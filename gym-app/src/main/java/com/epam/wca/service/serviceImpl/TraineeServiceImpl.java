package com.epam.wca.service.serviceImpl;

import com.epam.wca.dao.TraineeDAO;
import com.epam.wca.entity.Trainee;
import com.epam.wca.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TraineeServiceImpl implements TraineeService {

    @Autowired
    private TraineeDAO traineeDao;

    @Override
    public void addTrainee(Trainee trainee) {
        traineeDao.addTrainee(trainee);
    }

    @Override
    public Trainee getTraineeById(int id) {
        return traineeDao.getTraineeById(id);
    }

    @Override
    public void updateTrainee(Trainee traineeUpdate) {
        traineeDao.updateTrainee(traineeUpdate);
    }

    @Override
    public List listTrainees() {
        return traineeDao.listTrainees();
    }

    @Override
    public void removeTrainee(int id) {
        traineeDao.removeTraineeById(id);
    }
}
