package com.starter.entities.enums;

/**
 * Created by Yuksi on 24.04.2018.
 */
public enum Statuses {
    DRAFT (0),
    PUBLISHED (1),
    DISCARDED (2);

    int statusNumber;

    Statuses(int statusNumber) {
        this.statusNumber = statusNumber;
    }

    public int getStatusNumber() {
        return statusNumber;
    }


}
