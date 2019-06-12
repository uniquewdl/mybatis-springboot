package com.example.springbootmybatis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 15:03 2019/6/4
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public HumpMehthodArgResolve humpMehthodArgResolve(){
        return new HumpMehthodArgResolve();
    }
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(humpMehthodArgResolve());
    }
}