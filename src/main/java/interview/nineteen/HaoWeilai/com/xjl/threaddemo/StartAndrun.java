package interview.nineteen.HaoWeilai.com.xjl.threaddemo;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/3/20 21:13
 * @Description: StartAndrun 问题
 */

public class StartAndrun {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            count();
            System.out.println("nei"+Thread.currentThread().getName());
        });
        thread.start();
    }

    public static void  count(){
        System.out.println("wai"+Thread.currentThread().getName());
    }
}
