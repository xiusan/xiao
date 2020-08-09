package com.xjl.partten.dataalgorithm.Base.StackCase;

/**
 *
 * 数组实现
 *
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/2 17:09
 * @Description:
 */

public class StackImpl<Item> implements StackService<Item> { //泛型

    private int n; //初始化元素个数
    private Item[] date  = (Item[])new Object[5];  //初始化数据



    //扩容下扩容两倍 ，缩容
    public void reset(){
        if(n >= date.length ){  //如果初始化元素个数，大于值得个数就扩容
            Item[] newDate = (Item[])new Object[date.length*2];
            for (int i = 0; i < n; i++) {
                newDate[i] = date[i];
            }
            date = newDate;
        }
    }
    @Override
    public StackService<Item> push(Item item) {
        reset();
        date[n++] = item;
        return null;
    }

    @Override
    public Item pop() {
        Item item = date[--n];
        date[n] = null;
        return null;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public static void main(String[] args) {
        StackImpl<Object> stack = new  StackImpl<Object>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.push("7");
        stack.push("8");
        stack.push("9");
        stack.push("10");
        System.out.println(2%3);
    }
}
