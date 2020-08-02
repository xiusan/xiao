package com.xjl.partten.dataalgorithm.Base.LinkCase;

/**
 * 单行链表实现
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/8/1 21:01
 * @Description:
 */

public class LinkImpl {
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
       LingkNode lingkNode = new LingkNode(value);
       lingkNode.next = head;
       head = lingkNode;

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
            LingkNode cur = head;
            for (int i = 0; i < position; i++) {
                cur =cur.next;
            }
            LingkNode lingkNode = new LingkNode(value);
            lingkNode.next = cur.next;
            cur.next=  lingkNode;
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
            for (int i = 0; i < position; i++) {
                head =head.next;
            }
             head =  head.next.next;

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
            for (int i = 0; i < position+1; i++) {
                    head = head.next;
            }
            head.value = val;

    }

    /**
      * 查
      * @Author xiaojinlu
      * @Description
      * @Date 2020/8/1 21:06
      * @Param
      * @return
      **/
   public void get(int val){
             while (head.next != null){
                 if(head.next.value == val)
                     break;
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
        class  LingkNode{

            int value;
            LingkNode next;

            public LingkNode(int value) {
                this.value = value;
            }
        }