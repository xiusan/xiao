package com.xjl.partten.dataalgorithm.Base.ArrayQueue;

/**
 * 数组实现队列
 *  一个值  val
 *  一个人头 head
 *  一个尾 tail
 *  一个数组 data
 *  一个大小 size
 *
 *
 *  有个问题，ooooQQQQQQ
 *  前面的空间会浪费
 */
public class ArrayQueueImpl {

    private int n=0;
    private int head=0;
    private int tail=0;
    private int[] data;
    private int size=0;

    public ArrayQueueImpl(int initSize) {

        this.n = initSize;
        this.data = new int[initSize];
    }

    /**
     * 添加数据
     */
    public void  push(int inData){
        if(tail == n)return;
        data[tail] = inData;
        tail++;
    }

    /**
     * 添加获取数据
     */
    public int  pop(){
        int datum = data[head];
        head++;
        return datum;
    }
    /**
     * 是否为空
     */
    public void  imempty(){
        if(head == tail){
            System.out.printf("是空");

        }else {
            System.out.printf("非空");
        }

    }
    /**
     * 获取大小
     */
    public int  size(){

        return this.size;
    }
}
