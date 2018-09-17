package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.GivenAnswerDao;
import ua.levelup.domain.GivenAnswer;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("givenAnswerDao")
public class GivenAnswerDaoImpl implements GivenAnswerDao {

    private SessionFactory sessionFactory;

    @Override
    public GivenAnswer addGivenAnswer(GivenAnswer givenAnswer) {
        sessionFactory.getCurrentSession().save(givenAnswer);
        return givenAnswer;
    }

    @Override
    public List<GivenAnswer> getAllForAttempt(int attemptId) {
        return null;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
