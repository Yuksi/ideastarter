package com.starter.dao;

import com.starter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Yuksi on 24.04.2018.
 */

@RepositoryRestResource
public interface IUserRepository extends JpaRepository<User, Long> {

    User findByLogin(@Param("login") String login);

    User findById(@Param("id") long id);

    List<User> findByName(@Param("name") String name);

}