package com.starter.services;
/**
 * Created by Irina on 07.05.2018.
 */

public interface ISecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
