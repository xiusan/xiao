package com.xjl.test;

/**
 * Created by Administrator on 2019/7/24.
 */
public class fn {
    public static void main(String[] args) {
        System.out.println(sds());
    }


    public static int sds() {
        int uu = 1 ;
        try {
            uu =3;
            return uu;
        }catch (Exception d){
            uu =4;
            return uu;
        }finally {
            uu =5;
        }

    }
}
