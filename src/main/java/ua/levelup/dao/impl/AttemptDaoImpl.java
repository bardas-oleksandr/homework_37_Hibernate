package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.AttemptDao;
import ua.levelup.domain.Attempt;
import ua.levelup.domain.User;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("attemptDao")
public class AttemptDaoImpl implements AttemptDao {

    private SessionFactory sessionFactory;

    @Override
    public Attempt addAttempt(Attempt attempt) {
        sessionFactory.getCurrentSession().save(attempt);  //Сохраняем результат теста в таблицу Attempts.
        //При этом все вложенные ответы тоже будут сохранены в таблице GivenAnswers
        return attempt;
    }

    @Override
    public List<Attempt> getAllForUser(User user) {
        return sessionFactory.getCurrentSession().getNamedQuery("Attempt.getAllForUser")
                .setParameter("user", user).list();
    }

    @Override
    public Attempt getLastForUser(User user) {
        List<Attempt> attemptList = sessionFactory.getCurrentSession().getNamedQuery("Attempt.getLastForUser")
                .setParameter("user", user).list();
        return attemptList.get(0);
    }

    @Override
    public Attempt getWithAnswers(Attempt attempt) {
        return (Attempt)sessionFactory.getCurrentSession().getNamedQuery("Attempt.getWithAnswers")
                .setParameter("id", attempt.getId()).uniqueResult();
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
