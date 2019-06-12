package com.example.springbootmybatis.service;

import com.example.springbootmybatis.po.Student;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 17:20 2019/5/16
 */
public interface TestService {
    Student findById(Integer id);

    void save(Student student);

    void updateStudent(Student student);
}
