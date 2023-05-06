package com.bankxz.backend.configs;

import com.bankxz.backend.configs.properties.DatasourceProperties;
import com.bankxz.backend.configs.providers.RecordMapperProviderImpl;
import lombok.RequiredArgsConstructor;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@RequiredArgsConstructor
public class DatabaseConfig {

    private final DatasourceProperties datasourceProperties;

    @Bean
    public org.jooq.Configuration getJooqConfiguration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.setSQLDialect(SQLDialect.POSTGRES);
        jooqConfiguration.set(getConnection());
        jooqConfiguration.set(new RecordMapperProviderImpl());
        return jooqConfiguration;
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    datasourceProperties.getUrl(),
                    datasourceProperties.getUsername(),
                    datasourceProperties.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}