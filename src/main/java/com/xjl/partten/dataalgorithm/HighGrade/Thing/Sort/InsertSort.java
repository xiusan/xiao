package com.xjl.partten.dataalgorithm.HighGrade.Thing.Sort;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/6 23:15
 * @Description:
 */

public class InsertSort {
    public static void main(String[] args) {
        int[] nubs = {9,6,1,2,4,5};
        // i从1开始分为两组
        for (int i = 1; i < nubs.length; i++) {
            int nub = nubs[i];
            int j = i-1;
            for (; j >= 0; j--) {
                if(nubs[j] > nub){
                    nubs[j+1] = nubs[j];
                }else {
                    break;
                }

            }
            nubs[j+1] =nub;

        }
        for (int i = 0; i < nubs.length; i++) {
            int nub = nubs[i];

            System.out.println(nub);
        }
    }
}
