package ua.levelup.dao;

import ua.levelup.domain.User;

public interface UserDao {
    User addUser(User user);
    User getUserByLogin(String login);
}
