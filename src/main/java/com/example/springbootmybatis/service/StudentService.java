package com.example.springbootmybatis.service;

import com.example.springbootmybatis.po.Student;

import java.util.List;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:09 2019/5/17
 */
public interface StudentService {
    public List<Student> findListBynameLie(String teacherName);
}
