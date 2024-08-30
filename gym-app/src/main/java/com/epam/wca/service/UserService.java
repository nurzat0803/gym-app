package com.epam.wca.service;


import com.epam.wca.entity.User;

import java.util.List;

public interface UserService {
    public void addUser(User u);
    public void updateUser(User u);
    public List<User> listUsers();
    public User getUserById(int id);
    public void removeUser(int id);
}
