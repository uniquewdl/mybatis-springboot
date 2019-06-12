package com.example.springbootmybatis.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 11:11 2019/5/17
 */
@Data
@ToString
public class TeacherVo {

    private String teacherName;

    private Integer age;

    private String sex;

    private  String [] strArray;


}