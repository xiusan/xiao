package com.xjl.designpatterns.dependenceinversion;

/**
 * @Author: xiaojinlu1990@ 163.com
 * @Date: 2019/6/26 0026.
 * @Version 1.0
 */
public class Xjinlu {
    public  ICouse iCouse;


    public void setiCouse(ICouse iCouse) {
        this.iCouse = iCouse;
    }

    public void studyInternatCouse(){
        iCouse.studyCouse();
    }
}
