package com.starter.dao;

import com.starter.entities.Idea;
import com.starter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */

@RepositoryRestResource
public interface IIdeaRepository extends JpaRepository<Idea, Long> {

    List<Idea> findByAuthor(@Param("author") User author);

    List<Idea> findByAuthorId(@Param("author_id") long id);
    Idea save(Idea idea);
    Idea findById(@Param("id") long id);


}