package com.starter.entities.enums;

/**
 * Created by Yuksi on 24.04.2018.
 */
public enum Roles {
    GUEST(0),
    USER(1),
    MODERATOR(2),
    ADMINISTRATOR(3);

    int roleNumber;

    Roles(int roleNumber) {
        this.roleNumber = roleNumber;
    }

    public int getRoleNumber() {
        return roleNumber;
    }
}
