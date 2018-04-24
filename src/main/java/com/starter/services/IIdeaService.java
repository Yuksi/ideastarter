package com.starter.services;

import com.starter.dao.IIdeaRepository;
import com.starter.entities.Idea;
import com.starter.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */
public interface IIdeaService {
    public List<Idea> getAll();

    public List<Idea> getByUser(User user);
    public List<Idea> getByUserId(long id);

    Idea getById(long id);

    public void addByAuthorId(Idea idea, long author_id);
}