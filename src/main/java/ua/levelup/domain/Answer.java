package ua.levelup.domain;

public class Answer {
    private int id;
    private String answer;
    private boolean correct;
    private Question question;

    public Answer() {
    }

    public Answer(int id, String answer, boolean correct, Question question) {
        this.id = id;
        this.answer = answer;
        this.correct = correct;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
