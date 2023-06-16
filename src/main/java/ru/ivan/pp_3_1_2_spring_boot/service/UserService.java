package ru.ivan.pp_3_1_2_spring_boot.service;



import ru.ivan.pp_3_1_2_spring_boot.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void removeUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
