package com.xjl.partten.uuiddemo;

import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;

import java.util.UUID;

/**
 *
 *
 *
 * 简单生成UUID
 *  1 mysql自增
 *  2 java uuid生成 & 糊涂工具包
 *  3分布式锁生成 zookeeper  redis
 *  4 snowflake
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 20:25
 * @Description:
 *
 *
 *
为什么需要分布式全局唯一ID以及分布式ID的业务需求
ID生成规则部分硬性要求
            1.全局唯一
            2.趋势递增
            3.单调递增
            4.信息安全
                    如果ID是连续的,恶意用户的扒取工作就非常容易做了,直接按照顺序下载指定URL即可 所以在一些应用场景下,
                    需要ID无规则 不规则,让竞争对手不好猜
            5.含时间戳
                    这样就能在开发中快速了解分布式id的生成时间

        ID号生成系统的可用性要求
            高可用 ： 发一个获取分布式ID的请求,服务器就要保证99.999%的情况下给我创建一个唯一分布式ID
        低延迟： 发一个获取分布式ID的请求,服务器就要快,极速
        高 QPS：假如并发一口气创建分布式ID请求同时杀过来,服务器要顶得住且一下子成功创建10万
 *
 */

public class SimpleGenerateId {

            /*
        * java原生生成UUID
        * 介绍
        *UUID含义是通用唯一识别码 (Universally Unique Identifier)，这 是一个软件建构的标准，也是被开源软件基金会
        * (Open Software Foundation, OSF) 的组织在分布式计算环境 (Distributed Computing Environment, DCE) 领域的一部份
        *
        * 缺点
        *  1 无业务意义，浪费系统资源
        *  2 如果需要时间排序还需创建时间（create_time）
        *  3 生出的过长而且有“-”分隔符
        * 优点
        *  1 使用简单直接生成用java.util.UUID;不需要额为代码
        *  2 小型项目生成唯一识别码
        * 应该场景
        *   1 生成数据库id
        *   2 订单编码
        *   。。。
        *
        * 实例
        *
        *
        * */

        public String getSimpleUuid(){

            return UUID.randomUUID().toString();
        }

       /*
        * https://mvnrepository.com/artifact/com.fasterxml.uuid/java-uuid-generator生成UUID
        * 介绍
        *
        *
        * 缺点
        * 1 需要引入包
        *
        * 优点
        * 1 生成有时间顺序的字段.节约字段
        * 2 节约索引资源
        *
        * 应该场景
        * 1 全局唯一ID
        * 实例
        * 1数据库ID
        * 2 业务ID
        * */
       public String getBuilderUuid(){
           TimeBasedGenerator timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress.constructMulticastAddress());
           return timeBasedGenerator.generate().toString();
       }


}
