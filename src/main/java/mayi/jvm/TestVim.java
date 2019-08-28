package mayi.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/8/2.
 */
public class TestVim {
    //栈溢出
    private static int count;
    public static void count(){
        try {
            count++;
             count();
        } catch (Throwable e) {
            System.out.println("最大深度:"+count);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        count();
    }

}
