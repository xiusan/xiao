package com.xjl;

import java.io.*;
import java.util.*;

public class show {
    public static void main(String[] args) {
        Map<String, String> mapTree = new TreeMap<String, String>(
                new Comparator<String>() {
                    public int compare(String obj1, String obj2) {
                        // 降序排序
                        return obj2.compareTo(obj1);
                    }
                });
        //map放入要分隔的字符串
        Map<String,String> map = getMapString();

        for (String s : map.keySet()) {
            //分隔获取值
           Map mapRe = getValue(s);
            Set<String> keySet = mapRe.keySet();
            Iterator<String> iter = keySet.iterator();
            while (iter.hasNext()) {
                String key = iter.next();
                mapTree.put(key,mapRe.get(key).toString());
            }
        }
        Set<String> keySet = mapTree.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + ":" + mapTree.get(key));
        }


    }

    private static Map getValue(String s) {
        Map<String, String> map = new  TreeMap<String, String>();
        StringBuffer sb =  getFile1("D:/fg.txt");
        String[]  fg = sb.toString().split(s);
        map.put(s,(fg.length-1)+"");
        return  map;
    }

    private static Map<String, String> getMapString() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("netty","netty");
        map.put("spring","spring");
        map.put("springboot","springboot");
        map.put("cloud","cloud");
        map.put("dubbo","dubbo");
        map.put("zookeeper","zookeeper");
        map.put("rabitmq","rabitmq");
        map.put("kafka","kafka");
        map.put("mq","mq");
        map.put("netty","netty");
        map.put("jvm","jvm");
        map.put("mongodb","mongodb");
        map.put("oracle","oracle");
        map.put("redis","redis");
        map.put("memcached","memcached");
        map.put("hbase","hbase");
        map.put("mysql","mysql");
        map.put("hibernate","hibernate");
        map.put("mybatis","mybatis");
        map.put("nosql","nosql");
        map.put("es","es");
        map.put("elasticsearch","elasticsearch");
        map.put("5年","5年");
        map.put("4年","4年");
        map.put("3年","3年");
        map.put("本科","本科");
        map.put("大专","大专");
        map.put("统招","统招");
        map.put("linux","linux");
        map.put("unix","unix");
        map.put("tomcat","tomcat");
        map.put("nginx","nginx");
        map.put("maven","maven");
        map.put("git","git");
        map.put("svn","svn");
        map.put("io","io");
        map.put("http","http");
        map.put("多线程","多线程");
        map.put("集合","集合");
        map.put("分布式","分布式");
        map.put("缓存","缓存");
        map.put("消息","消息");
        map.put("kubernetes","kubernetes");
        map.put("docker","docker");
        return  map;
    }

    public static StringBuffer getFile(String fileName) {
        StringBuffer sb = new StringBuffer();
        //fg.txt
        File file = new File(fileName);
        Reader reader = null;
        try {
            System.out.println("以字符为单位读取文件内容，一次读一个字节：");
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    sb.append((char) tempchar);
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb;
    }

    public static StringBuffer getFile1(String filePath) {
        StringBuffer sb = new StringBuffer();
        try {
            File f = new File(filePath);
            if (f.isFile() && f.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(f), "UTF-8");
                BufferedReader reader = new BufferedReader(read);
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                read.close();
            }
        } catch (Exception e) {
            System.out.println("读取文件内容操作出错");
            e.printStackTrace();
        }
        return sb;
    }
}
