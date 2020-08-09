package com.xjl.partten.dataalgorithm.LingCode;

import java.util.Arrays;

/** 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。

 请返回 nums 的动态和。

  

 示例 1：

 输入：nums = [1,2,3,4]
 输出：[1,3,6,10]
 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 示例 2：

 输入：nums = [1,1,1,1,1]
 输出：[1,2,3,4,5]
 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 示例 3：

 输入：nums = [3,1,2,10,1]
 输出：[3,4,6,16,17]

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/9 21:04
 * @Description:
 */

public class ArraySimple {

    public static void main(String[] args) {
        int nums[] = new int[]{3,1,2,10,1};
        for (int i = 0; i < nums.length; i++) {
            int temp=nums[i];
            for (int j = 1; j <=i; j++) {
                temp = nums[j-1]+nums[j];
            }
            nums[i]  = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
