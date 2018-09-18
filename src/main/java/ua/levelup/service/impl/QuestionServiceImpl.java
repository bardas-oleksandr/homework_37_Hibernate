package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.levelup.dao.QuestionDao;
import ua.levelup.domain.Question;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.QuestionService;
import ua.levelup.validator.QuestionValidator;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;

    @Override
    public void addQuestionWithAnswers(Question question) {
        QuestionValidator.validateQuestion(question);
        try {
            questionDao.addQuestion(question);
        } catch (Exception e) {
            throw new ApplicationException("Question was not created", e);
        }
    }

    @Override
    public void initializeAnswerList(Question question){
        Question retrieved = questionDao.getWithAnswers(question);
        question.setAnswerList(retrieved.getAnswerList());
    }

    public QuestionDao getQuestionDao() {
        return questionDao;
    }

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }
}
