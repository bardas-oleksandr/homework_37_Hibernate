package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.levelup.dao.QuestionDao;
import ua.levelup.domain.Answer;
import ua.levelup.domain.Question;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.AnswerService;
import ua.levelup.service.QuestionService;
import ua.levelup.validator.QuestionValidator;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    private QuestionDao questionDao;
    private AnswerService answerService;

    @Override
    public void addQuestionWithAnswers(Question question) {
        QuestionValidator.validateQuestion(question);
        try {
            questionDao.addQuestion(question);
            for (Answer answer: question.getAnswerList()) {
                answerService.createNewAnswer(answer);
            }
        } catch (Exception e) {
            throw new ApplicationException("Question was not created", e);
        }
    }

    public QuestionDao getQuestionDao() {
        return questionDao;
    }

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public AnswerService getAnswerService() {
        return answerService;
    }

    @Autowired
    public void setAnswerService(AnswerService answerService) {
        this.answerService = answerService;
    }
}
