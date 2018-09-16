package ua.levelup.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private int id;
    private String question;
    private Topic topic;
    private List<Answer> answerList;

    public Question() { }

    public Question(int id, Topic topic, String question) {
        this.id = id;
        this.topic = topic;
        this.question = question;
        this.answerList = new ArrayList<>();
    }

    public Question(int id, Topic topic, String question, List<Answer> answerList) {
        this.id = id;
        this.topic = topic;
        this.question = question;
        this.answerList = answerList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public void addAnswer(Answer answer){
        this.answerList.add(answer);
    }
}
