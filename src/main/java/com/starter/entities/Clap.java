package com.starter.entities;

import javax.persistence.*;

/**
 * Created by Yuksi on 24.04.2018.
 */

@Entity
@Table
public class Clap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "idea_id", nullable = false)
    private Idea idea;

    @ManyToOne
    @JoinColumn(name = "clapping_id", nullable = false)
    private User clapping;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public User getClapping() {
        return clapping;
    }

    public void setClapping(User clapping) {
        this.clapping = clapping;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clap clap = (Clap) o;

        if (idea != null ? !idea.equals(clap.idea) : clap.idea != null) return false;
        return clapping != null ? clapping.equals(clap.clapping) : clap.clapping == null;

    }

    @Override
    public int hashCode() {
        int result = idea != null ? idea.hashCode() : 0;
        result = 31 * result + (clapping != null ? clapping.hashCode() : 0);
        return result;
    }
}