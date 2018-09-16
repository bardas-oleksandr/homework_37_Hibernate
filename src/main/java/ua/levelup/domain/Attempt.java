package ua.levelup.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Attempt {
    private int id;
    private User user;
    private Date date;
    private double result;
    private List<GivenAnswer> givenAnswerList;

    public Attempt() { }

    public Attempt(int id, User user, Date date, double result) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.result = result;
        this.givenAnswerList = new ArrayList<>();
    }

    public Attempt(int id, User user, Date date, double result, List<GivenAnswer> givenAnswerList) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.result = result;
        this.givenAnswerList = givenAnswerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public List<GivenAnswer> getGivenAnswerList() {
        return givenAnswerList;
    }

    public void setGivenAnswerList(List<GivenAnswer> givenAnswerList) {
        this.givenAnswerList = givenAnswerList;
    }

    public void addGivenAnswer(GivenAnswer givenAnswer){
        this.givenAnswerList.add(givenAnswer);
    }
}
