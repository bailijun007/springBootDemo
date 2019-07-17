package com.blj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
//@ConfigurationProperties(prefix = "jdbc")//方法一：
public class JdbcProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;


}
