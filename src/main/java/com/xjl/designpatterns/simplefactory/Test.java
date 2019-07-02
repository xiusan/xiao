package com.xjl.designpatterns.simplefactory;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/28 0028.
 * @Version 1.0
 * 业务场景
 * 创建生产视频类
 *
 */
public class Test {
    public static void main(String[] args) {
        FactoryVideo factoryVideo =  new FactoryVideo();
        Video video = factoryVideo.getVideo(JavaVideo.class);
        video.getVodeo();
    }
}
