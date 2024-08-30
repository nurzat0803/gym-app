package com.epam.wca.service.serviceImpl;

import com.epam.wca.dao.UserDAO;
import com.epam.wca.entity.User;
import com.epam.wca.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUser(User userUpdate) {
        userDao.updateUser(userUpdate);
    }

    @Override
    public List listUsers() {
        return userDao.listUsers();
    }

    @Override
    public void  removeUser(int id) {
        userDao.removeUserById(id);
    }
}

