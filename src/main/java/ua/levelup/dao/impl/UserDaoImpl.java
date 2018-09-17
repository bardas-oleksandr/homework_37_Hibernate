package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.UserDao;
import ua.levelup.domain.User;
import ua.levelup.exception.ApplicationException;

import javax.annotation.Resource;

@Transactional
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    public User addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public User getUserByLogin(String login) {
        return (User) sessionFactory.getCurrentSession().getNamedQuery("User.findByLogin")
                .setParameter("login", login).uniqueResult();
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
