package com.atlige.seckill.dao;

import com.atlige.seckill.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Jeremy lI
 * @description:
 * @date: created in 2021/4/25 13:38
 */
public interface SuccessKilledDao {
    /**
     * 插入秒杀成功的记录, 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") String userPhone);

    /**
     * 根据id查询 SuccessKilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId);

}
