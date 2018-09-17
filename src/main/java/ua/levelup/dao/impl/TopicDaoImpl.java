package ua.levelup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.levelup.dao.TopicDao;
import ua.levelup.domain.Topic;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Repository("topicDao")
public class TopicDaoImpl implements TopicDao {

    private SessionFactory sessionFactory;

    @Override
    public Topic addTopic(Topic topic) {
        sessionFactory.getCurrentSession().save(topic);
        return topic;
    }

    @Transactional(readOnly=true)
    @Override
    public List<Topic> getAllWithQuestions() {
        return sessionFactory.getCurrentSession()
                .getNamedQuery("Topic.findAllWithQuestions").list();
    }

    @Override
    public List<Topic> getAllWithQuestionsAndAnswers() {
        return null;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
}
