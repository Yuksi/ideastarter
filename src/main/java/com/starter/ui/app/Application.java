package com.starter.ui.app;

import com.starter.entities.enums.Statuses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yuksi on 14.09.2017.
 */


public class Application {

    public static void main(String[] args) {
        String ss = "published";
        Statuses s = Statuses.valueOf(ss.toUpperCase());
        System.out.println(s);
    }

}
