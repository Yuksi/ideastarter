package com.starter.entities;

import javax.persistence.*;

/**
 * Created by Yuksi on 24.04.2018.
 */

@Entity
@Table
public class Media {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "idea_id", nullable = false)
    private Idea idea;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Media media = (Media) o;

        if (name != null ? !name.equals(media.name) : media.name != null) return false;
        return idea != null ? idea.equals(media.idea) : media.idea == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (idea != null ? idea.hashCode() : 0);
        return result;
    }
}