package ua.levelup.dao;

import ua.levelup.domain.Attempt;

import java.util.List;

public interface AttemptDao {
    Attempt addAttempt(Attempt attempt);
    List<Attempt> getAllForUser(String login);
}
