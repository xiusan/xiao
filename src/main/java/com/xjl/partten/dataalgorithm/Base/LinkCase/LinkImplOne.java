package com.xjl.partten.dataalgorithm.Base.LinkCase;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/2 11:34
 * @Description:
 */

public class LinkImplOne {
    private int size;
    private LingkNode head;

    /**
     * 插入链表头部
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 21:06
     * @Param
     * @return
     **/
    public void insertHead(int value){
        LingkNode newNode = new LingkNode(value);
        newNode.next = head;
        head = newNode;
    } /**
     * 增加
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 21:06
     * @Param
     * @return
     **/
    public void insert(int value,int position){
        if(position == 0){
            insertHead(value);
        }else {
            LingkNode curr = head;
            for (int i = 0; i < position; i++) {
                curr = curr.next;
            }

            LingkNode newNode = new LingkNode(value);
            newNode.next = curr.next;
            curr = newNode;
        }
    }
    /**
     * 删
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 21:06
     * @Param
     * @return
     **/
    public void delete(int position){
        LingkNode curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        curr = curr.next.next;

    }
    /**
     * 改
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 21:06
     * @Param
     * @return
     **/
    public void update(int position,int val){
        LingkNode curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        curr.value = val;

    }

    /**
     * 查 适用于便利时间复杂度。O（n）
     * @Author xiaojinlu
     * @Description
     * @Date 2020/8/1 21:06
     * @Param
     * @return
     **/
    public void get(int val){

        while (head.next == null){
            if (head.value == val){
                break;
            }
        }
    }







    public static void main(String[] args) {
        LinkImpl link = new LinkImpl();
        link.insert(23,0);
        link.insert(21,0);
        link.insert(31,1);
        link.insert(41,1);
        link.insert(51,1);
    }

}


class LinkNode{
    int value;
    LinkNode next;
}
