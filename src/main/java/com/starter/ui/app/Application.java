package com.starter.ui.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yuksi on 14.09.2017.
 */

@SpringBootApplication(scanBasePackages={"com.starter"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
