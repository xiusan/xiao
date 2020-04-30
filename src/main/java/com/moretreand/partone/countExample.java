package com.moretreand.partone;


import com.xjl.controller.T;
import groovy.util.logging.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 *  2019/11/24.
 *  并发编程开始
 */
@Slf4j
public class countExample {
    private  final static Logger log = LoggerFactory.getLogger(countExample.class);
    private  static int  threadTotal = 200;
    private  static int  clientTotal = 5000;
    private  static int  count = 0;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for (int i = 0; i < clientTotal; i++) {
            executor.execute(() -> {
                try {
                    semaphore.acquire();
                    add();
                    semaphore.release();
                }catch (Exception e){
                    e.printStackTrace();
                }
                    }

            );
        }
        executor.shutdown();

        log.info("count{}",count);


    }

    private static void add() {
        count++;
    }
}
