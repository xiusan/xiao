package com.xjl.designpatterns.simplefactory;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/28 0028.
 * @Version 1.0
 */
public class FactoryVideo{
    public Video getVideo(Class cc){
        Video video = null;
        try {
            video = (Video) Class.forName(cc.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
