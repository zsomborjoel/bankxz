package com.bankxz.backend.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@ConfigurationProperties(prefix = "spring.datasource")
public class DatasourceProperties {
    private String url;
    private String username;
    private String password;
}
