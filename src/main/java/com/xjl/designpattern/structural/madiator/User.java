package com.xjl.designpattern.structural.madiator;

/**
 * Created by Administrator on 2019/9/26.
 */
public class User
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void showMessage(String Message){
        StudyGroup.showMassge(this,Message);
    }

}
