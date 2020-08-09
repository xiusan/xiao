package com.xjl.partten.dataalgorithm.HighGrade.Sort;

import com.xjl.partten.xjl.controller.T;

import java.util.Arrays;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/8 23:09
 * @Description:
 */

public class PaoSort {
    public static void main(String[] args) {
        bubblingSort(new int[]{54,1,2,32,4,77,4});

    }
    public static void bubblingSort(int[] nubs){

        for (int i = 0; i < nubs.length-1; i++) {
            for (int j = 0; j < nubs.length-1-i; j++) {
                if(nubs[j]>nubs[j+1]){
                    int temp = nubs[j];
                    nubs[j]=nubs[j+1];
                    nubs[j+1] = temp;
                }

            }

            String s = Arrays.toString(nubs);
            System.out.println(s);
        }

    }
}
