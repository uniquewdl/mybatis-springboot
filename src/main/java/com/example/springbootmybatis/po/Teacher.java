package com.example.springbootmybatis.po;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 9:25 2019/5/17
 */
@Data
@ToString
 //@TableName(value = "teacher")
public class Teacher {
   //  @TableId(value = "teacher_id", type = IdType.AUTO)
    private Integer teacherId;

     //@TableField(value = "techer_name")
    public String teacherName;

//    @TableField(value = "sex")
    public String sex;

//     @TableField(value = "age")
    public Integer age;

//    @TableField(value = "birthday")
    public Date birthday;

//    @TableField(value = "is_value")
    public Integer isValue;
}