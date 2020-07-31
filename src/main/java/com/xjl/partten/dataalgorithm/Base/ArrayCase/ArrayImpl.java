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

public class ArrayImpl {

    private int size;   //存放的数组大小
    private int[] date; //数组
    private int index; //已经存放的

    public ArrayImpl(int size) {  //数组初始化
        this.size = size;
        this.date = new int[size];
        this.index = 0;
    }

    public int[] insert(int loc,int n){
        if(index++ <size){
            for (int i = size - 1; i > loc; i--) {

                date[i] = date[i-1];
            }
            date[loc] = n;
        }
        return date;
    }


    public void delete(int loc){
        if(loc <= index){
            for (int i =loc ; i < size; i++) {

                date[i] = date[i+1];
            }
        }
        index--;
    }


    public void update(int loc,int n){
        date[loc] = n;

    }

    public int select(int loc){
      return  date[loc];
    }
    public void print(){

        for (int i = 0; i < index; i++) {
            System.out.println( date[i]);
        }
    }

    public static void main(String[] args) {
        ArrayImpl array = new ArrayImpl(10);
        array.insert(1,22);
        array.insert(2,22);
        array.insert(3,22);
        array.insert(4,22);
        System.out.println(array.index);
    }




}
