package ua.levelup.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USERS")
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

    @Id
    @Column(name="LOGIN")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name="PASSWORD")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
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
