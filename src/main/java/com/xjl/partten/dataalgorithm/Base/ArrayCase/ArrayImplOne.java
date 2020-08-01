package com.xjl.partten.dataalgorithm.Base.ArrayCase;

/**
 *
 *
 * 实现基本的数组增删改查
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/7/31 22:35
 * @Description:
 */

public class ArrayImplOne {

    private int size;   //存放的数组大小
    private int[] date; //数组
    private int index; //已经存放的




    /**
     *
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 9:07
     * @Param
     * int loc 下标
     * int n 值 value
     *
     * @return
     **/

    public ArrayImplOne(int size) {
        this.size = size;
        this.date =new int[size]; //数组
        this.index = 0; //已经存放的
    }
    /**
      *
      * @Author xiaojinlu
      * @Description
      * @Date 2020/8/1 9:07
      * @Param
      * int loc 下标
      * int n 值 value
      *
      * @return
      **/
    public int insert(int loc,int n) {
        if(index++ <size){
            for (int i = size-1; i > loc; i--) {
                date[i] = date[i-1];
            }
            date[loc] = n;
        }

        return index;
    }
    /**
      *
      * @Author xiaojinlu
      * @Description
      * @Date 2020/8/1 9:07
      * @Param
      * int loc 下标
      * int n 值 value
      *
      * @return
      **/
    public int delete(int loc) {
        if(loc <size){
            for (int i = loc; i <size-1; i++) {
                date[i] = date[i-1];
            }
            date[index] = 0;
        }else {
            System.out.println("数组越界");
            return 0;
        }
        index--;
        return index;
    }     /**
      *
      * @Author xiaojinlu
      * @Description
      * @Date 2020/8/1 9:07
      * @Param
      * int loc 下标
      * int n 值 value
      *
      * @return
      **/
    public void update(int loc,int n) {
    date[loc] = n;
    }
    /**
      *
      * @Author xiaojinlu
      * @Description
      * @Date 2020/8/1 9:07
      * @Param
      * int loc 下标
     *
      * @return
      **/
    public int select(int loc) {
        return date[loc];
    }

    public static void main(String[] args) {
        ArrayImplOne arrayImplOne = new ArrayImplOne(20);
        arrayImplOne.insert(1,1);
        arrayImplOne.insert(2,3);
        arrayImplOne.insert(3,4);
        arrayImplOne.delete(3);
        System.out.println(arrayImplOne.index);
    }
}
