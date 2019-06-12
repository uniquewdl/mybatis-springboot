package com.example.springbootmybatis.dao;
import com.example.springbootmybatis.po.Student;
import org.apache.ibatis.annotations.Mapper;
/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 17:13 2019/5/16
 */
@Mapper
public interface TestDao {
/*    public Student findById(Integer id);

    public void save(Student student);*/

    void updateStudent(Student student);
}