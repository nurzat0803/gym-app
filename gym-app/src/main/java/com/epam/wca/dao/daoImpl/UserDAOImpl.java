package com.epam.wca.dao.daoImpl;

import com.epam.wca.dao.UserDAO;
import com.epam.wca.entity.Trainee;
import com.epam.wca.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    private final Map<Integer, User> map = new HashMap<>();

    @Override
    public void addUser(User user) {
        map.put(user.getId(), user);
    }

    @Override
    public void updateUser(User user) {
        map.replace(user.getId(), user);
    }

    @Override
    public List<User> listUsers() {
        return (List<User>) map.values();
    }

    @Override
    public User getUserById(int id) {
        return map.get(id);
    }

    @Override
    public void removeUserById(int id) {
        map.remove(id);
    }
}

