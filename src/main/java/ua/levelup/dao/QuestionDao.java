package ua.levelup.dao;

import ua.levelup.domain.Question;

import java.util.List;

public interface QuestionDao {
    Question addQuestion(Question question);
    List<Question> getAllForTopic(int topicId);
}
