package javatast.threadtest;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2019/8/22.
 */
public class threadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new CallbackValue());
        if(!future.isDone()){
            System.out.println("noe done");
        }
        try {
            System.out.println("future.get()"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
}
