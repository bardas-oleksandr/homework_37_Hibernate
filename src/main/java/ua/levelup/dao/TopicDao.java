package ua.levelup.dao;

import ua.levelup.domain.Topic;

import java.util.List;

public interface TopicDao {
    Topic addTopic(Topic topic);
    List<Topic> getAllWithQuestions();
}
