package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.QuestionDao;
import ua.levelup.domain.Question;

import javax.annotation.Resource;

@Transactional
@Repository("questionDao")
public class QuestionDaoImpl implements QuestionDao {

    private SessionFactory sessionFactory;

    @Override
    public Question addQuestion(Question question) {
        sessionFactory.getCurrentSession().save(question);  //Сохраняем вопрос в таблицу Questions.
        //При этом все вложенные ответы тоже будут сохранены в таблице Answers
        return question;
    }

    @Override
    public Question getWithAnswers(Question question) {
        return (Question)sessionFactory.getCurrentSession().getNamedQuery("Question.getWithAnswers")
                .setParameter("id", question.getId()).uniqueResult();
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
