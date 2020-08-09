package com.xjl.partten.dataalgorithm.Base.ArrayCase;

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                index = i;
                break;
            }
            if((i+1) <nums.length ){
                if(nums[i] < target && nums[i+1] > target){
                                index = i++;
                    break;
                }
            }else{
                 index = i++;
            break;
            }
            
        } 

        return index;
    }
    public static int removeDuplicates(int[] nums) {

        
    int index = 0; 
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if((i+1) <nums.length ){

                if(nums[i] != nums[i+1]){
                    nums[index++] = num;
                }
            }
            if(i == nums.length-1 ){
                nums[index++] = num;
                }
        }

        return index ;
    }

    public static void main(String[] args) {
        int[] nums =new int[6];
        nums[0]=1;
        nums[1]=5;
        nums[2]=6;
        nums[3]=7;
        nums[4]=7;
        nums[5]=8;
        removeDuplicates(nums);

/*        int[] nums =new int[4];
        nums[0]=1;
        nums[1]=2;
        nums[2]=5;
        nums[3]=7;
        System.out.printf(""+searchInsert( nums, 5));*/
    }
}