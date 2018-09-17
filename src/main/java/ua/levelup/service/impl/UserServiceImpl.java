package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ua.levelup.dao.UserDao;
import ua.levelup.domain.User;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.SecurityService;
import ua.levelup.service.UserService;
import ua.levelup.validator.UserValidator;

@Service("userService")
public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private SecurityService securityService;

    @Override
    public void register(User user) {
        UserValidator.validateUser(user);
        try {
            userDao.addUser(user);
        } catch (DataIntegrityViolationException e) {
            throw new ApplicationException("User was not created. Login or username is already taken", e);
        } catch (Exception e) {
            throw new ApplicationException("User was not created", e);
        }
    }

    @Override
    public User login(String login, String password) {
        UserValidator.validateUsersCredentials(login, password);
        User retrievedFromDb = userDao.getUserByLogin(login);
        if (!securityService.isCorrectPassword(retrievedFromDb, password)) {
            throw new ApplicationException("Access denied! Wrong password.");
        }
        return retrievedFromDb;
    }

    @Autowired
    public void setUserDao(@Value("#{userDao}") UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setSecurityService(@Value("#{securityService}") SecurityService securityService) {
        this.securityService = securityService;
    }
}
