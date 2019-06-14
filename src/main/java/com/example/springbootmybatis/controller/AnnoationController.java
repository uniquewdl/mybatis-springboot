package com.example.springbootmybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 10:18 2019/6/10
 */
@RestController
@RequestMapping("test/")
public class AnnoationController {
    private static final String TAG = "AnnoationController";

    @RequestMapping("notnull")
    public String validNotNull(@NotNull String name){
        return name;
    }

    


}  