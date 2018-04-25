package com.starter.dao.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Yuksi on 25.04.2018.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = "com.starter.entities")
@EnableJpaRepositories(basePackages = "com.starter.dao")
@EnableTransactionManagement
public class RepositoryConfiguration {
}