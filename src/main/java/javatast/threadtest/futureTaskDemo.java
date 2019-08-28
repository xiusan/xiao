package javatast.threadtest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by Administrator on 2019/8/22.
 */
public class futureTaskDemo {

    public static void main(String[] args) {
        String value = null;
                FutureTask<String> futureTask = new FutureTask<String>(new CallbackValue());
        new Thread(futureTask).start();
        if(!futureTask.isDone()){
            System.out.println("noe done");
        }
        try {
              value = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("task return :"+value);
    }
}
