package com.starter.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */
@Entity
@Table
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;

    @Column(nullable = false)
    private String about;

    @Column(nullable = false)
    private int status;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="idea")
    private List<Media> medias;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="idea")
    private List<Clap> claps;

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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
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

        Idea idea = (Idea) o;

        if (name != null ? !name.equals(idea.name) : idea.name != null) return false;
        if (author != null ? !author.equals(idea.author) : idea.author != null) return false;
        return about != null ? about.equals(idea.about) : idea.about == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (about != null ? about.hashCode() : 0);
        return result;
    }
}