package com.starter.services.impl;

import com.starter.dao.IIdeaRepository;
import com.starter.dao.IUserRepository;
import com.starter.entities.Idea;
import com.starter.entities.User;
import com.starter.services.IIdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */

@Service
public class IdeaService implements IIdeaService {
    @Autowired
    IIdeaRepository ideaRepository;
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<Idea> getAll() {
        return ideaRepository.findAll();
    }

    @Override
    public List<Idea> getByUser(User user) {
        return ideaRepository.findByAuthor(user);
    }

    @Override
    public List<Idea> getByUserId(long id) {
        return ideaRepository.findByAuthorId(id);
    }

    @Override
    public Idea getById(long id) {
        return ideaRepository.findById(id);
    }

    @Override
    public void addByAuthorId(Idea idea, long author_id) {
        User user = userRepository.findById(author_id);
        idea.setAuthor(user);
        idea.setStatus(0);
        ideaRepository.save(idea);
    }
}