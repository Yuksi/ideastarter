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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
    @Transient
    private String passwordConfirm;

    private String name;

    @Column(name = "e_mail")
    private String email;

    @Column
    private String about;

    @Column
    private int role;


    public String getPasswordConfirm() {
    return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<Idea> ideas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clapping")
    private List<Clap> claps;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

}