-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE seckill;
-- 使用数据库
use seckill;
-- 创建秒杀库存表
create TABLE seckill(
`seckill_id` bigint not null auto_increment comment '商品库存id',
`name` varchar(120) not null comment '商品名称',
`number` int not null comment '库存数量',
`start_time` timestamp not null comment '秒杀开启时间',
`end_time` timestamp not null comment '秒杀结束时间',
`create_time` timestamp not null default current_timestamp comment '创建时间',
primary key("seckill_id"),
key inx_start_time("start_time"),
key inx_end_time("end_time"),
key inx_create_time("create_time")
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF-8 COMMENT='秒杀库存表';

-- 初始化数据
insert into
    seckill(`name`, `number`, start_time, end_time)
values
    ('1000元秒杀IphoneX', '1000', '2021-04-25 00:00:00', '2021-04-26 00:00:00'),
    ('500元秒杀华为Mate40 Pro', '1800', '2021-04-25 00:00:00', '2021-04-26 00:00:00'),
    ('5000元秒杀MacBook Pro', '500', '2021-04-25 00:00:00', '2021-04-26 00:00:00'),
    ('2000元秒杀Ipad Pro', '1000', '2021-04-25 00:00:00', '2021-04-26 00:00:00');

-- 秒杀成功明细表
-- 用户登录认证相关信息
create table success_killed(
`seckill_id` bigint not null auto_increment comment '商品库存id',
`phone` varchar(11) NOT NULL COMMENT '用户电话',
`state` tinyint NOT NULL DEFAULT  0 COMMENT '状态标识：-1：无效 0：成功 1：已付款 2：已发货',
`create_time` TIMESTAMP  NOT NULL COMMENT '创建时间',
PRIMARY KEY (seckill_id , phone) , /*联合主键*/
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=UTF-8 COMMENT='秒杀成功明细表';