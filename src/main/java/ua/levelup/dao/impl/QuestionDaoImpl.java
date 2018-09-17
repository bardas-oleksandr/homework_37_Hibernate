package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.QuestionDao;
import ua.levelup.domain.Question;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("questionDao")
public class QuestionDaoImpl implements QuestionDao {

    private SessionFactory sessionFactory;

    @Override
    public Question addQuestion(Question question) {
        sessionFactory.getCurrentSession().save(question);
        return question;
    }

    @Override
    public List<Question> getAllForTopic(int topicId) {
        return null;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
