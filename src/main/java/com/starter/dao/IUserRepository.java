package com.starter.dao;

import com.starter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Yuksi on 24.04.2018.
 */


public interface IUserRepository extends JpaRepository<User, Long> {

    User findByUsername(@Param("username") String username);

    User findById(@Param("id") long id);

    User findByName(@Param("name") String name);

}


