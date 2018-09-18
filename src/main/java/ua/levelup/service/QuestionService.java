package ua.levelup.service;

import ua.levelup.domain.Question;

public interface QuestionService {
    void addQuestionWithAnswers(Question question);
    void initializeAnswerList(Question question);
}
