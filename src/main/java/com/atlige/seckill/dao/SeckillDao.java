package com.atlige.seckill.dao;

import com.atlige.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author: Jeremy lI
 * @description:
 * @date: created in 2021/4/25 13:34
 */
public interface SeckillDao {
    /**
     * 减库存操作
     * @param seckillId
     * @param killTime 相当于createTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(@Param("seckillId") long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表(分页查询)
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
