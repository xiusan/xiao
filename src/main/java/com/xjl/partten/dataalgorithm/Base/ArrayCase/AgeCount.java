package com.xjl.partten.dataalgorithm.Base.ArrayCase;

import cn.hutool.core.util.RandomUtil;

import java.io.*;

/**
 *
 * 统计人的年龄范围  10亿
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/31 21:40
 * @Description:
 */

public class AgeCount {
    public static void main(String[] args) throws Exception {
        readAge();
//        write();


    }

    private static void readAge() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("J:\\age.txt")));
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
        long start = System.currentTimeMillis();


        int[] ints = new int[200];

        while (bufferedReader.read() != -1){
            String line = bufferedReader.readLine();
            if(null != line && !"".equals(line)){
                int i = Integer.parseInt(line);
                int anInt1 = ints[i];
                ints[i] = anInt1+1;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.println(i +"-----"+ anInt);

        }
        bufferedReader.close();
        inputStreamReader.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void write() throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("J:\\age.txt")));
        BufferedWriter bufferedWriter =new BufferedWriter(outputStreamWriter);
        for (int i = 0; i < 1000000000; i++) {
            bufferedWriter.write(RandomUtil.randomInt(0,200)+"\r\n");
            if(i % 100000 == 0){

                bufferedWriter.flush();
            }
        }
        bufferedWriter.flush();
        outputStreamWriter.close();


    }
}
