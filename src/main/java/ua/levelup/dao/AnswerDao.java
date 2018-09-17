package ua.levelup.dao;

import ua.levelup.domain.Answer;

import java.util.List;

public interface AnswerDao {
    Answer addAnswer(Answer answer);
    List<Answer> getAllForQuestion(int questionId);
}
