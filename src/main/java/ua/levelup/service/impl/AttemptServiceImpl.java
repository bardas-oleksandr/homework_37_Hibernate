package ua.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.levelup.dao.AttemptDao;
import ua.levelup.domain.Attempt;
import ua.levelup.domain.User;
import ua.levelup.service.AttemptService;
import ua.levelup.service.GivenAnswerService;

import java.util.List;

@Service("attemptService")
public class AttemptServiceImpl implements AttemptService {

    private AttemptDao attemptDao;
    private GivenAnswerService givenAnswerService;

    @Override
    public void addNewTest(Attempt attempt) {

    }

    @Override
    public List<Attempt> watchUsersResults(User user) {
        return null;
    }

    @Override
    public Attempt showLastAttempt(User user) {
        return null;
    }

    public AttemptDao getAttemptDao() {
        return attemptDao;
    }

    @Autowired
    public void setAttemptDao(AttemptDao attemptDao) {
        this.attemptDao = attemptDao;
    }

    public GivenAnswerService getGivenAnswerService() {
        return givenAnswerService;
    }

    @Autowired
    public void setGivenAnswerService(GivenAnswerService givenAnswerService) {
        this.givenAnswerService = givenAnswerService;
    }
}
