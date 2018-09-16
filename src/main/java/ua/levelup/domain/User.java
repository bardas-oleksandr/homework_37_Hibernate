package ua.levelup.domain;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private String name;
    private List<Attempt> attemptList;

    public User(){}

    public User(String login, String password, String name){
        this.login = login;
        this.password = password;
        this.name = name;
        this.attemptList = new ArrayList<>();
    }

    public User(String login, String password, String name, List<Attempt> attemptList) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.attemptList = attemptList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attempt> getAttemptList() {
        return attemptList;
    }

    public void setAttemptList(List<Attempt> attemptList) {
        this.attemptList = attemptList;
    }

    public void addAttempt(Attempt attempt){
        this.attemptList.add(attempt);
    }
}
