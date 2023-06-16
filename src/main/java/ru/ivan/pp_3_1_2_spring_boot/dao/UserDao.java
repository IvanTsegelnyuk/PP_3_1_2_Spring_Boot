package ru.ivan.pp_3_1_2_spring_boot.dao;



import ru.ivan.pp_3_1_2_spring_boot.models.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
