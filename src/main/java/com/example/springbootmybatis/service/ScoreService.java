package com.example.springbootmybatis.service;

import com.example.springbootmybatis.po.Score;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 8:54 2019/5/17
 */
public interface ScoreService {
    public void updateScore(Score score);
    public  void save(Score score);
}
