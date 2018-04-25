package com.starter.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */
@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true, nullable = false)
    private String login;

    @Column(nullable = false)
    private String psw;

    private String name;

    @Column(name = "e_mail")
    private String email;

    @Column(nullable = false)
    private String about;

    @Column(nullable = false)
    private int role;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="author")
    private List<Idea> ideas;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="clapping")
    private List<Clap> claps;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public List<Clap> getClaps() {
        return claps;
    }

    public void setClaps(List<Clap> claps) {
        this.claps = claps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return login != null ? login.equals(user.login) : user.login == null;

    }

    @Override
    public int hashCode() {
        return login != null ? login.hashCode() : 0;
    }
}