package com.xjl.partten.dataalgorithm.HighGrade.Sort;

/**
 * 插入排序思想
 * 1 逻辑上分为两个数组
 * 2 把第二个数组的第一个向前移动，并排好顺序
 * 3 依次递进直致完成
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/6 23:15
 * @Description:
 */

public class InsertSortOne {
    public static void main(String[] args) {
        int[] nubs = {9,6,1,2,4,5};
        sort(nubs);
        for (int i = 0; i < nubs.length; i++) {
            System.out.println(nubs[i]);

        }

    }

    public static int[] sort(int[] nubs) {

        for (int i = 1; i < nubs.length; i++) {
            int nub = nubs[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if(nubs[j] < nub){ //这里犯过错误.和前一个对比并比较
                    nubs[j+1] = nubs[j];
                    nubs[j] = nub ;
                }else {
                    break;
                }


            }

        }

        return nubs;
    }
}
