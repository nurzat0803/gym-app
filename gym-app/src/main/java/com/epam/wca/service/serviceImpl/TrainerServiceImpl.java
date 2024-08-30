package com.epam.wca.service.serviceImpl;

import com.epam.wca.dao.TrainerDAO;
import com.epam.wca.entity.Trainer;
import com.epam.wca.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerDAO trainerDao;

    @Override
    public void addTrainer(Trainer trainer) {
        trainerDao.addTrainer(trainer);
    }

    @Override
    public Trainer getTrainerById(int id) {
        return trainerDao.getTrainerById(id);
    }

    @Override
    public void updateTrainer(Trainer trainerUpdate) {
        trainerDao.updateTrainer(trainerUpdate);
    }

    @Override
    public List listTrainers() {
        return trainerDao.listTrainers();
    }
}
