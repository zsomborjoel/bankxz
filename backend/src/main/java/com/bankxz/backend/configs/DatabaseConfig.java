package com.bankxz.backend.configs;

import com.bankxz.backend.properties.DatasourceProperties;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderQuotedNames;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.boot.autoconfigure.jooq.JooqAutoConfiguration;
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

    @Bean
    public org.jooq.Configuration getJooqConfiguration() {
        return new DefaultConfiguration().derive(getConnection());
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