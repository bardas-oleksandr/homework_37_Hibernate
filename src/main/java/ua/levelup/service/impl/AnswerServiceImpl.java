package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import ua.levelup.dao.AnswerDao;
import ua.levelup.domain.Answer;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.AnswerService;
import ua.levelup.validator.AnswerValidator;

@Service("answerService")
public class AnswerServiceImpl implements AnswerService {

    private AnswerDao answerDao;

    @Override
    public void createNewAnswer(Answer answer) {
        AnswerValidator.validateAnswer(answer);
        try {
            answerDao.addAnswer(answer);
        } catch (Exception e) {
            throw new ApplicationException("Answer was not created", e);
        }
    }

    public AnswerDao getAnswerDao() {
        return answerDao;
    }

    @Autowired
    public void setAnswerDao(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }
}
