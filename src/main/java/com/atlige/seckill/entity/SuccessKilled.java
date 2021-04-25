package com.atlige.seckill.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author: Jeremy lI
 * @description: 成功秒杀类
 * @date: created in 2021/4/25 13:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SuccessKilled {
    private long seckillId;
    private String userPhone;
    private int state;
    private Date createTime;
    // 多对一。多个秒杀成功类对应一个秒杀实体类
    private Seckill seckill;
}
