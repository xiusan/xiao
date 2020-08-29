package com.xjl.partten.dataalgorithm.HighGrade.Sort;

import java.util.Arrays;

/**
 *  冒泡排序
 *  思想
 * 1 两次巡航
 * 2 每次排序获取最大的
 * 3 交换
 * 4 依次根据上面的流程直到完成
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/9 10:02
 * @Description:
 */

public class BobbleSort1 {

    public static void main(String[] args) {

        int[] nubs = new int[]{9,2,288,17,5,1,12144,2};

        for (int i = 0; i < nubs.length; i++) {
            for (int j = 0; j < nubs.length-1-i; j++) {
                if(nubs[j] > nubs[j+1]){
                    int temp = nubs[j];
                    nubs[j] = nubs[j+1];
                    nubs[j+1]  = temp;
                }

            }

        }



        System.out.println(Arrays.toString(nubs));


    }

}
