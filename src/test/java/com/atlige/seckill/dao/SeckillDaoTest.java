package com.atlige.seckill.dao;

import com.atlige.seckill.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


/**
 * 配置 Spring 和 Junit 整合，Junit启动时加载SpringIoc容器
 * @author: Jeremy lI
 * @description:
 * @date: created in 2021/4/25 15:38
 */
@RunWith(SpringRunner.class)
// 告诉junit spring配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() {
        System.out.println(seckillDao.reduceNumber(1000, new Date()));
    }

    @Test
    public void queryById() {
        long seckillId = 1000;
        System.out.println(seckillDao.queryById(seckillId));
    }

    @Test
    public void queryAll() {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        System.out.println(seckills);
    }
}