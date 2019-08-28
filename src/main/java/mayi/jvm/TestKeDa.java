package mayi.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/8/2.
 */
public class TestKeDa {
    public static void main(String[] args) {
        /*-Xms10m
        -Xmx10m
        -Xmn1m
        -XX:SurvivorRatio=2
        -XX:+PrintGCDetails
        -XX:+UseSerialGC*/
        List<Object> listObject = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            Byte[] bytes = new Byte[1 * 1024 * 1024];
            listObject.add(bytes);
        }
    }

}
