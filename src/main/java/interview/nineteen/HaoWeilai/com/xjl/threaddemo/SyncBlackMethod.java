package interview.nineteen.HaoWeilai.com.xjl.threaddemo;

/**
 * Created by Administrator on 2019/11/17.
 */
public class SyncBlackMethod {

    private void syncTaskCool(){

        synchronized (this){
            System.out.printf("Hello");
        }
    }
    //同步方法
    private synchronized void syncTask(){
        System.out.printf("Hello Again");
    }


}
