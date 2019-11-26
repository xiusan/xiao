package com.xjldemo.composite;

/**
 * 关键代码
 * list
 * 关键词
 * 树，部分整体，菜单，包含自己
 */
public class Demo {

    public static void main(String[] args) {
        Employee ceo = new Employee();
        ceo.setAge("1");
        ceo.setName("1");
        Employee employ = new Employee();
        employ.setAge("2");
        employ.setName("2");
        ceo.add(employ);
        Employee emp = new Employee();
        emp.setAge("3");
        emp.setName("3");
        employ.add(emp);
        for (Employee e2:ceo.get()) {
            System.out.println(e2.toString());
            for (Employee e3:e2.get()) {
                System.out.println(e3.toString());

            }
        }

    }
}
