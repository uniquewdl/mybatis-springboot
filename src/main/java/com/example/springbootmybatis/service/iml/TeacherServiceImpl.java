package com.example.springbootmybatis.service.iml;
import com.example.springbootmybatis.dao.TeacherDao;
import com.example.springbootmybatis.po.Teacher;
import com.example.springbootmybatis.service.TeacherService;
import com.example.springbootmybatis.vo.TeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:18 2019/5/17
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Override
    public List<Teacher> findAllTeacherByNameLike(TeacherVo vo) {
        return teacherDao.findTeacherListByNameLike(vo);
    }

    @Override
    public Integer deleteTeacherById(Integer id) {
        Integer rowNum= teacherDao.deleteTeacherById(id);
       return rowNum;
    }
}