package com.example.springbootmybatis.service;

import com.example.springbootmybatis.po.Teacher;
import com.example.springbootmybatis.vo.TeacherVo;

import java.util.List;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:17 2019/5/17
 */
public interface TeacherService {
    List<Teacher> findAllTeacherByNameLike(TeacherVo vo);

    Integer deleteTeacherById(Integer id);
}
