package com.example.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 16:47 2019/5/16
 */
@Configuration
public class MybatisDataSourceConfig {
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String userName;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String className;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setUrl(this.url);
        source.setUsername(this.userName);
        source.setPassword(this.password);
        source.setDriverClassName(this.className);
        return source;
    }
}
