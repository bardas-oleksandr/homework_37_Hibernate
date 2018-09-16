package ua.levelup.domain;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private int id;
    private String topicName;
    private List<Question> questionList;

    public Topic() { }

    public Topic(int id, String topicName) {
        this.id = id;
        this.topicName = topicName;
        this.questionList = new ArrayList<>();
    }

    public Topic(int id, String topicName, List<Question> questionList) {
        this.id = id;
        this.topicName = topicName;
        this.questionList = questionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public void addQuestion(Question question){
        this.questionList.add(question);
    }
}
