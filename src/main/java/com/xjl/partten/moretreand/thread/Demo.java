package com.xjl.partten.moretreand.thread;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Auther: xiaojinlu1990@163.partten
 * @Date: 2020/3/21 19:12
 * @Description:
 */

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ThreadDemo();
       // HashDemo();
        //测试生产消费队列
        Demo demo = new Demo();
        demo.BQueue();
    }

    private void BQueue() {
        BlockingQueue blockingQueue = new ArrayBlockingQueue(100);

       new  Thread(new task(blockingQueue),"111").start();
       new  Thread(new task1(blockingQueue),"222").start();

    }

    class task implements  Runnable  {
        private  BlockingQueue blockingQueue;
        public task(BlockingQueue blockingQueue){
            this.blockingQueue = blockingQueue;
        }

        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 55; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                blockingQueue.add("eeeee"+1);
            }

        }
    }

    class task1 implements  Runnable  {
        private  BlockingQueue blockingQueue;
        public task1(BlockingQueue blockingQueue){
            this.blockingQueue = blockingQueue;
        }

        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 55; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
                try {
                    blockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    private static void HashDemo() {
    List list = Arrays.asList("aa","aa","aa","aa","aa","aa","aa");
    List list1 =new ArrayList();
        for (int i = 0; i < 7; i++) {
            list1.add("a");

        }
        System.out.println(list.hashCode() == list1.hashCode());
        System.out.println(list.hashCode() == list1.hashCode());
    }

    private static void ThreadDemo() throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<String>(new MyThread());
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());

        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> futur = service.submit(new MyThread());

        System.out.println(futur.get());
        service.shutdown();
    }
}
