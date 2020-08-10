package com.xjl.partten.dataalgorithm.LingCode;

/**
 求出最长公共前缀
 ["xjksa","xjdaww","xjdada","xjiuui"]

 思路：1 最少一个相同
 2 找出最最短的对比
 3 计数
 问题：一个最短置换取得最短

 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/9 21:04
 * @Description:
 */

public class ArraySimple4 {

//    预期：
    public static void main(String[] args) {
        String[] array = {"xjjjjksa","xjjjjdaww","xjjjdada","xjjjjjyyyyyyyyjjjjiuui"};
        String returnStrnew = null ;
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            int length = array[0].length();
            String str = array[index];
            for (int j = 0; j < length-1; j++) {
                if(str.length() > j){
                    String  returnStr = str.substring(0,j+1);
                    if(array[i].contains(returnStr)){
                        returnStrnew = returnStr;
                        if(returnStrnew.length() >= returnStr.length()){
                            index =i;
                        }
                    }
                }

            }

        }
        System.out.println(returnStrnew);
    }
}
