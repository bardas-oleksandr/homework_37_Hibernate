package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.AnswerDao;
import ua.levelup.domain.Answer;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("answerDao")
public class AnswerDaoImpl implements AnswerDao {

    private SessionFactory sessionFactory;

    @Override
    public Answer addAnswer(Answer answer) {
        sessionFactory.getCurrentSession().save(answer);
        return answer;
    }

    @Override
    public List<Answer> getAllForQuestion(int questionId) {
        return null;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
