package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ua.levelup.dao.TopicDao;
import ua.levelup.domain.Topic;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.TopicService;
import ua.levelup.validator.TopicValidator;

import java.util.List;

@Service("topicService")
public class TopicServiceImpl implements TopicService {

    private TopicDao topicDao;

    @Override
    public void createTopic(Topic topic) {
        TopicValidator.validateTopic(topic);
        try {
            topicDao.addTopic(topic);
        } catch (DataIntegrityViolationException e) {
            throw new ApplicationException("Topic was not created: such topic already exists", e);
        } catch (Exception e) {
            throw new ApplicationException("Topic was not created", e);
        }
    }

    @Override
    public List<Topic> getAllWithQuestions() {
        return topicDao.getAllWithQuestions();
    }

    public TopicDao getTopicDao() {
        return topicDao;
    }

    @Autowired
    public void setTopicDao(TopicDao topicDao) {
        this.topicDao = topicDao;
    }
}
