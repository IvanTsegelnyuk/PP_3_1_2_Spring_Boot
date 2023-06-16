package ru.ivan.pp_3_1_2_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ivan.pp_3_1_2_spring_boot.dao.UserDao;
import ru.ivan.pp_3_1_2_spring_boot.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void removeUser(User user) {
        userDao.removeUser(user);
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.createUser(user);
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
