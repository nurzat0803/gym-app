package com.epam.wca.dao.daoImpl;


import com.epam.wca.dao.TrainingDAO;
import com.epam.wca.entity.Training;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class TrainingDAOImpl implements TrainingDAO {

    private final Map<Integer, Training> map = new HashMap<>();

    @Override
    public void addTraining(Training training) {
        map.put(training.getId(), training);
    }

    @Override
    public List<Training> listTrainings() {
        return (List<Training>) map.values();
    }

    @Override
    public Training getTrainingById(int id) {
        return map.get(id);
    }
}
