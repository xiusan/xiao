package javatast.threadtest;


import java.util.concurrent.Callable;

/**
 *
 * Created by xiaojinlu on 2019/8/22.
 *  测试回调函数
 *  1，主线程阻塞
 *  2 Thread join
 *  3 集成callback
 *  4 利用线程池
 */
public class CallbackValue implements Callable<String> {


    @Override
    public String call() throws Exception {
        String value = "task";
        System.out.println("ready to work ");
        Thread.currentThread().sleep(500);
        System.out.println("task is done");
        return value;
    }
}
