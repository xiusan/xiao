package com.xjl.partten.uuiddemo;

/**
 * 分布式ID生成策略
 * 1 业务ID生成
 *   1 业务码 + UUID  例子 （北京 +商品类型 + UUID）
 * 2 统一生成服务ID
 *   1 zookeeper 问题 ： 性能瓶超过一千就会有问题
 *   2 redis 问题 ： 存在重试问题耗费时间，不利于核心链路的高可用
 * 3 落地实践的两种方式
 *  1 生成一批放到内存中心
 *  2 单点生成id  机器码+时间戳 + 自增序列  保证全局唯一性
 * 4 NTP问题
 *
 *
 *  5 核心业务  兜底策略
 *
 *
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/11 20:24
 * @Description:
 */

public class Test {

    public static void main(String[] args) {

        /*--------------单点----------------------*/
   /*     SimpleGenerateId simpleGenerateId = new SimpleGenerateId();
        for (int i = 0; i < 10; i++) {
            System.out.println(simpleGenerateId.getSimpleUuid());
        }  */

        SimpleGenerateId simpleGenerateId = new SimpleGenerateId();
        for (int i = 0; i < 10; i++) {
            System.out.println(simpleGenerateId.getBuilderUuid());
        }
        /*--------------单点----------------------*/
        /*--------------分布式----------------------*/



        /*--------------分布式----------------------*/
    }

}
