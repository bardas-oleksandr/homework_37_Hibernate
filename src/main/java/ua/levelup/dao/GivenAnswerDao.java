package ua.levelup.dao;

import ua.levelup.domain.GivenAnswer;

import java.util.List;

public interface GivenAnswerDao {
    GivenAnswer addGivenAnswer(GivenAnswer givenAnswer);
    List<GivenAnswer> getAllForAttempt(int attemptId);
}
