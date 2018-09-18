package ua.levelup.dao;

import ua.levelup.domain.Attempt;
import ua.levelup.domain.User;

import java.util.List;

public interface AttemptDao {
    Attempt addAttempt(Attempt attempt);
    List<Attempt> getAllForUser(User user);
    Attempt getLastForUser(User user);
    Attempt getWithAnswers(Attempt attempt);
}
