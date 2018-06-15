package com.starter.services;

import com.starter.entities.Idea;
import com.starter.entities.User;
import com.starter.entities.enums.Statuses;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */
public interface IIdeaService {
     List<Idea> getAll();
     List<Idea> getWithStatus(Statuses status);

     List<Idea> getByUser(User user);
     List<Idea> getByUserId(long id);

    Idea getById(long id);

     void addByAuthorId(Idea idea, long author_id);
}