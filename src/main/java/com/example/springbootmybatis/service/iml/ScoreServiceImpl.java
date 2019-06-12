package com.example.springbootmybatis.service.iml;

import com.example.springbootmybatis.dao.ScoreDao;
import com.example.springbootmybatis.po.Score;
import com.example.springbootmybatis.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: weidl
 * @Description:
 * @Date: Created in 8:55 2019/5/17
 */
@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    private ScoreDao scoreDao;

    @Override
    public void updateScore(Score score) {
        scoreDao.update(score);
    }

    @Override
    public void save(Score score) {
        scoreDao.save(score);
    }
}