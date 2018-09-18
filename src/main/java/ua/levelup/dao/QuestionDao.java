package ua.levelup.dao;

import ua.levelup.domain.Question;

public interface QuestionDao {
    Question addQuestion(Question question);
    Question getWithAnswers(Question question);
}
