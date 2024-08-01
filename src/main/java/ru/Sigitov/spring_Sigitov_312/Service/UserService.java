package ru.Sigitov.spring_Sigitov_312.Service;


import ru.Sigitov.spring_Sigitov_312.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();
}

