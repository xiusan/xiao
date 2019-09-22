package com.xjl.designpattern.creational.singleton;

import java.io.*;

/**
 *  单例模式 on 2019/9/14.
 *  序列化返回不同对象的问题
 *
 */
public class TestSralazyble {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungerSingleton hungerSingleton = HungerSingleton.getInstabce();
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filename"));
       oos.writeObject(hungerSingleton);
        File file = new File("filename");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungerSingleton hungerSingleton1 = (HungerSingleton) ois.readObject();

        System.out.println(hungerSingleton);
        System.out.println(hungerSingleton1);
        System.out.println(hungerSingleton1 == hungerSingleton);



    }

}
