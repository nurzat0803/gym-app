package com.epam.wca.dao.daoImpl;



import com.epam.wca.dao.TrainerDAO;
import com.epam.wca.entity.Trainee;
import com.epam.wca.entity.Trainer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
@Transactional
public class TrainerDAOImpl implements TrainerDAO {

    private final Map<Integer, Trainer> map = new HashMap<>();

    @Override
    public void addTrainer(Trainer trainer) {
        map.put(trainer.getId(), trainer);
    }

    @Override
    public void updateTrainer(Trainer trainer) {
        map.replace(trainer.getId(), trainer);
    }

    @Override
    public List<Trainer> listTrainers() {
        return (List<Trainer>) map.values();
    }

    @Override
    public Trainer getTrainerById(int id) {
        return map.get(id);
    }
}
