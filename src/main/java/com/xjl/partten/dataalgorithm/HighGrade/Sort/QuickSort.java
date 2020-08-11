package com.xjl.partten.dataalgorithm.HighGrade.Sort;

import java.util.Arrays;

/**
 * 1 获取基准数
 * 2 左右对比，对比交换，加入左边小于右边基准数放入
 * 3 递归 直到完成
 * Created by Administrator on 2020/8/10.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] data = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        System.out.println(Arrays.toString(Qsort(data,0,data.length-1)));
    }

    public static  int[] Qsort(int data[],int left,int right){
        int base = data[left];
        int ll = left;
        int rr = right;
        while (ll<rr){
            while (ll<rr && data[rr] >= base){
                rr--;
            }

            if (ll<rr){
                int temp = data[rr];
                data[rr]=data[ll];
                data[ll]=temp;
                ll++;
            }

            while (ll<rr && data[ll] <= base){
                ll++;
            }

            if (ll<rr){
                int temp = data[rr];
                data[rr]=data[ll];
                data[ll]=temp;
                rr--;
            }
        }
        if (left<ll)
            Qsort(data,left,ll-1);
        if (ll<left)
            Qsort(data,ll + 1,right);

        return data;
    }
}
