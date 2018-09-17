package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.AttemptDao;
import ua.levelup.domain.Attempt;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("attemptDao")
public class AttemptDaoImpl implements AttemptDao {

    private SessionFactory sessionFactory;

    @Override
    public Attempt addAttempt(Attempt attempt) {
        sessionFactory.getCurrentSession().save(attempt);
        return attempt;
    }

    @Override
    public List<Attempt> getAllForUser(String login) {
        return null;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
