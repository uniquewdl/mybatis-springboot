package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.Hump;
import com.example.springbootmybatis.po.Score;
import com.example.springbootmybatis.po.Student;
import com.example.springbootmybatis.po.Teacher;
import com.example.springbootmybatis.service.ScoreService;
import com.example.springbootmybatis.service.TeacherService;
import com.example.springbootmybatis.service.TestService;
import com.example.springbootmybatis.vo.TeacherVo;
import com.example.springbootmybatis.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 17:13 2019/5/16
 */
@RestController
@RequestMapping("testController")
public class TestContorller {
    @Autowired
    private TestService testService;

    @Autowired
    private ScoreService scoreService;
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        return testService.findById(id);
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(Student student) {
        
        String isSuccess = "success";

        try {
            testService.save(student);
        } catch (Exception e) {
            e.printStackTrace();
            isSuccess = "false";
        }
        return isSuccess;
    }
    /**
     * 更新
     */
    @RequestMapping("/update")
    public void updateStudent(Student student) {
        testService.updateStudent(student);
    }
    /**
     * 更新score表
     */
    @RequestMapping("/updateScore")
    public void updateScore(Score score) {
        System.out.println("===============》入参:" + score);
        scoreService.updateScore(score);
    }

    @RequestMapping("/saveScore")
    public void saveScore(Score score) {
        scoreService.save(score);
    }
    /**
     * 查寻教师列表
     */
    @RequestMapping("/findTeacherList")
    public List<Teacher> list(TeacherVo vo) {
        return teacherService.findAllTeacherByNameLike(vo);
    }
    @RequestMapping("/testarray")
    public String testArray(TeacherVo testStr){
        System.out.println(testStr);
        return "success";
    }
    @RequestMapping("/testArgs")
    public  String testArgs(@Hump TestVo testVo){
        System.out.println("==========<>>>>>>>>>><<<<<<<<<<>>>>>>>>"+testVo);
        return  "success";
    }
    public static void main(String args[]) throws ParseException {
        SimpleDateFormat mdf=new SimpleDateFormat("yyyy-MM-dd");
        Date mdfDate =null;
        mdfDate= mdf.parse("2019-06-06");
        System.out.println(mdfDate);
        Date date=new Date();
        SimpleDateFormat mdf2=new SimpleDateFormat("yyyyMMdd");
        String format = mdf2.format(date);
        System.out.println(format);
    }
    @GetMapping("/delete_teacher")
    public String deleteTeacherById(Integer id)
    {
     Integer flag=teacherService.deleteTeacherById(id);
        if(flag>0){
            return "success";
        }
        return "fail";
    }
}