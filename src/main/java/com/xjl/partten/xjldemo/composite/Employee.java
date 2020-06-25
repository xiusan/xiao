package com.xjl.partten.xjldemo.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/23.
 */
public class Employee {
    private  String name;
    private  String age;

    private List<Employee> xiaJi = new ArrayList<Employee>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //添加员工
    public void add(Employee employee){
        xiaJi.add(employee);
    }

    //删除员工
    public void remove(Employee employee){
        xiaJi.remove(employee);
    }
    //获取员工
    public List<Employee> get(){
       return xiaJi;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", xiaJi=" + xiaJi +
                '}';
    }
}
