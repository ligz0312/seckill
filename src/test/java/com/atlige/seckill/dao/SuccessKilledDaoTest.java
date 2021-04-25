package com.atlige.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: Jeremy lI
 * @description:
 * @date: created in 2021/4/25 16:27
 */
@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Autowired
    SuccessKilledDao successKilledDao;
    @Test
    public void insertSuccessKilled() {
        System.out.println(successKilledDao.insertSuccessKilled(1000L, "13222222222"));
    }

    @Test
    public void queryByIdWithSeckill() {
        System.out.println(successKilledDao.queryByIdWithSeckill(1000L));
    }
}