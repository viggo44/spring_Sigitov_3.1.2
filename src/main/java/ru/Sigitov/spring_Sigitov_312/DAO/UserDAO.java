package ru.Sigitov.spring_Sigitov_312.DAO;


import ru.Sigitov.spring_Sigitov_312.model.User;

import java.util.List;

public interface UserDAO {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

    List<User> getAllUsers();
}
