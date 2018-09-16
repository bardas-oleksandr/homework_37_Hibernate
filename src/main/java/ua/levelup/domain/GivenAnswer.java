package ua.levelup.domain;

public class GivenAnswer {
    private int id;
    private String question;
    private String givenAnswer;
    private boolean correct;
    private Attempt attempt;

    public GivenAnswer() { }

    public GivenAnswer(int id, String question, String givenAnswer, boolean correct, Attempt attempt) {
        this.id = id;
        this.question = question;
        this.givenAnswer = givenAnswer;
        this.correct = correct;
        this.attempt = attempt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getGivenAnswer() {
        return givenAnswer;
    }

    public void setGivenAnswer(String givenAnswer) {
        this.givenAnswer = givenAnswer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Attempt getAttempt() {
        return attempt;
    }

    public void setAttempt(Attempt attempt) {
        this.attempt = attempt;
    }
}
