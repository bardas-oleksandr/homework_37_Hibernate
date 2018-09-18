package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.levelup.dao.AttemptDao;
import ua.levelup.domain.Attempt;
import ua.levelup.domain.User;
import ua.levelup.exception.ApplicationException;
import ua.levelup.service.AttemptService;
import ua.levelup.validator.AttemptValidator;

import java.util.List;

@Service("attemptService")
public class AttemptServiceImpl implements AttemptService {

    private AttemptDao attemptDao;

    @Override
    public void addNewTest(Attempt attempt) {
        AttemptValidator.validateAttempt(attempt);
        try {
            attemptDao.addAttempt(attempt);
        } catch (Exception e) {
            throw new ApplicationException("Question was not created", e);
        }
    }

    @Override
    public List<Attempt> watchUsersResults(User user) {
        return attemptDao.getAllForUser(user);
    }

    @Override
    public Attempt getLastAttempt(User user) {
        return attemptDao.getLastForUser(user);
    }

    @Override
    public void initializeGivenAnswerList(Attempt attempt) {
        Attempt retrieved = attemptDao.getWithAnswers(attempt);
        attempt.setGivenAnswerList(retrieved.getGivenAnswerList());
    }

    public AttemptDao getAttemptDao() {
        return attemptDao;
    }

    @Autowired
    public void setAttemptDao(AttemptDao attemptDao) {
        this.attemptDao = attemptDao;
    }
}
