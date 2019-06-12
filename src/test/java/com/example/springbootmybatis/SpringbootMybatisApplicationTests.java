package com.example.springbootmybatis;

import com.example.springbootmybatis.dao.ScoreDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisApplicationTests {
    @Autowired
    private ScoreDao scoreDao;
    @Test
    public void contextLoads() {
        System.out.println("-----------------selectAll method test ------------");
      /*  List<Score> scoreList=scoreDao.selectList(null);
        Assert.assertEquals(8,scoreList.size());
        for(Score score:scoreList){
            System.out.println(score);
        }*/
    }
}
