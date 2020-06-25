package com.xjl.partten;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2019/11/10.
 */
public class MapTest {
    public static void main(String[] args) throws InterruptedException {
        for (int w = 0; w < 50; w++) {
            Map<String,Object> map = new Hashtable();
            long k1 = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                map.put(i+"",i+"");
            }
            long k2 = System.currentTimeMillis();
            System.out.println(k1-k2);
            long k3 = System.currentTimeMillis();
            Map<String,Object> mapp = new ConcurrentHashMap();
            for (int i = 0; i < 1000000; i++) {
                map.put(i+"",i+"");
            }
            long k4 = System.currentTimeMillis();
            System.out.println(k3-k4);
            System.out.println("-------------------");
            Thread.sleep(1000);
        }


    }
}
