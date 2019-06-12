package com.example.springbootmybatis.service.iml;

import com.example.springbootmybatis.dao.TestDao;
import com.example.springbootmybatis.po.Student;
import com.example.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 17:22 2019/5/16
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    @Override
    public Student findById(Integer id) {
        return null;
        //return testDao.findById(id);
    }

    @Override
    public void save(Student student) {
         //testDao.save(student);
    }
    @Override
    public void updateStudent(Student student) {
        testDao.updateStudent(student);
    }
}