package com.example.springbootmybatis.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:01 2019/5/17
 */
@Configuration
public class MybatisPlusConfig {





    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasouable", "true");
        properties.setProperty("dialect", "mysql");//配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }


}