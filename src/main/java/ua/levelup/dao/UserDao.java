package ua.levelup.dao;

import ua.levelup.domain.User;

import java.util.List;

public interface UserDao {
    User addUser(User user);
    User getUserByLogin(String login);
}
