package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.po.Score;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 8:48 2019/5/17
 */
@Mapper
public interface ScoreDao {
    public void update(Score score);

    @Insert("insert into score (stuname,score,birthday) values (#{stuname},#{score},#{birthday})")
    public void save(Score score);

}
