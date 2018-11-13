package com.exam.yiyou.examadmin.config;

import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import lombok.Data;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张世一
 * @version 1.0
 */
@MapperScan(basePackages = "com.exam.yiyou.examadmin.repository")
@Configuration
@ConfigurationProperties(prefix="spring.datasource")
@Data
public class ApplicationConfig {
    private String url;
    private String username;
    private String password;

    @Bean
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
