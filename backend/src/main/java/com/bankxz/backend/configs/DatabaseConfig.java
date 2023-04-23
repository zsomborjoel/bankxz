package com.bankxz.backend.configs;

import com.bankxz.backend.properties.DatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
@RequiredArgsConstructor
public class DatabaseConfig {

    private final DatasourceProperties datasourceProperties;

    @Bean
    public DSLContext getDslContext() {
        return DSL.using(getConnection(), SQLDialect.POSTGRES);
    }

    private Connection getConnection() {
        try (Connection conn = DriverManager.getConnection(
                datasourceProperties.getUrl(),
                datasourceProperties.getUsername(),
                datasourceProperties.getPassword())) {
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}