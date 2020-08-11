package com.xjl.partten.dataalgorithm.LingCode;

import java.util.Arrays;

/**
 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1:

 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 示例 2:

 输入: [4,3,2,1]
 输出: [4,3,2,2]
 解释: 输入数组表示数字 4321。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/plus-one
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/9 21:04
 * @Description:
 */

public class ArraySimple5 {
//思路
//    1：大于最后一个大于9.置为0
//      2：全部是9置为数组加1，数组首位置为1
//      3 ：非9置为+1
    public static void main(String[] args) {
        int digits[] = new int[]{8,9,9,9};
        int[] num3 = getInts(digits);

        System.out.println(Arrays.toString(num3));


    }

    private static int[] getInts(int digits[]) {

        int n = digits.length - 1;
        if(digits.length-1 == 0 && digits[0] != 9){
            digits[digits.length-1]++;
            return digits;
        }

        int m = 0;
        for (; n > 0; n--) {
            int i1 = digits[n];
            if (i1 == 9) {
                digits[n] = 0;
                m++;
            } else {
                digits[n] = ++digits[n];
                return digits;
            }

        }
        int[] num3 = new int[0];
        if (digits.length == (m + 1)) {
            num3 = new int[digits.length + 1];
            num3[0] = 1;
        }
        return num3;
    }
}
