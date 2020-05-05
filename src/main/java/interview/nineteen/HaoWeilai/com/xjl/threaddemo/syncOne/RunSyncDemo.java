package interview.nineteen.HaoWeilai.com.xjl.threaddemo.syncOne;

/**
 * Created by Administrator on 2019/11/16.
 */
public class RunSyncDemo {
    public static void main(String[] args) {
        SyncThread syncThread =new SyncThread();
        Thread thread1 = new Thread(syncThread,"A");
        Thread thread2 = new Thread(syncThread,"A");
        Thread thread3 = new Thread(syncThread,"B");
        Thread thread4 = new Thread(syncThread,"B");
        Thread thread5 = new Thread(syncThread,"C");
        Thread thread6 = new Thread(syncThread,"C");
        Thread thread7 = new Thread(syncThread,"D");
        Thread thread8 = new Thread(syncThread,"D");
        Thread thread9 = new Thread(syncThread,"E");
        Thread thread10 = new Thread(syncThread,"E");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
