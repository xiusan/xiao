package com.xjl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/8.
 */
public class Learn {

    //public static void main(String[] args) {
        //String charAll = "开依单接迪里合爱打架大萨达啊 ";
        //private static String[] arr = {"A","B","C","D","E","F","G"};
    private static String[] arr = {"单","依","接","开","迪","里","合"};
    public static void main(String[] args) {
        listAll(Arrays.asList(arr), "");
    }

    /**
     *  将数组分为2部分，前缀+数组
     *  前缀 = 前缀+数组移除的字符
     *  数组 = 数组移除字符后剩下的数组
     *  将数组中字符数据移除完成后，前缀即数组中的数据任一排列的数组
     */
    public static void listAll(List candidate, String prefix) {
        if(prefix.length()==arr.length){
            System.out.println(prefix);
        }

        for (int i = 0; i < candidate.size(); i++) {
            List tmp = new LinkedList(candidate);
            listAll(tmp, prefix + tmp.remove(i));
        }
    }
}
