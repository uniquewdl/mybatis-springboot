package com.example.springbootmybatis.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 8:46 2019/5/17
 */
@Data
@ToString
public class Score {
    private Integer studid;
    private String stuname;
    private Integer score;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date birthday;
}