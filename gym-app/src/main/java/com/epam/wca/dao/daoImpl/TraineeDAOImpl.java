package com.epam.wca.dao.daoImpl;

import com.epam.wca.dao.TraineeDAO;
import com.epam.wca.entity.Trainee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class TraineeDAOImpl implements TraineeDAO {

    private final Map<Integer, Trainee> map = new HashMap<>();

    @Override
    public void addTrainee(Trainee trainee) {
        map.put(trainee.getId(), trainee);
    }

    @Override
    public void updateTrainee(Trainee trainee) {
        map.replace(trainee.getId(), trainee);
    }

    @Override
    public List<Trainee> listTrainees() {
        return (List<Trainee>) map.values();
    }

    @Override
    public Trainee getTraineeById(int id) {
        return map.get(id);
    }

    @Override
    public void removeTraineeById(int id) {
        map.remove(id);
    }
}
