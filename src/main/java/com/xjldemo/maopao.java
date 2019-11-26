package com.xjldemo;

/**
 * Created by Administrator on 2019/11/22.
 */
public class maopao {

    public static void main(String[] args) {
        int[] sortArr = {2,3,1,21,23123,1231};
        for (int i = 0; i < sortArr.length-1; i++) {
            for (int j = 0; j < sortArr.length -1-i ; j++) {
                if(sortArr[j+1] < sortArr[j]){
                    int tamp = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = tamp;
                }
            }

        }
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);


        }

    }
}
