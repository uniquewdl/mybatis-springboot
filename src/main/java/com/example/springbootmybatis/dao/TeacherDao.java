package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.po.Teacher;
import com.example.springbootmybatis.vo.TeacherVo;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:10 2019/5/17
 */
@Mapper
public interface TeacherDao {
      List<Teacher> findTeacherListByNameLike(TeacherVo vo);

    Integer deleteTeacherById(Integer id);
}
