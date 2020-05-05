package interview.nineteen.HaoWeilai.com.xjl.designpattern.structural.madiator;

import java.util.Date;

/**
 * Created by Administrator on 2019/9/26.
 */
public class StudyGroup {
    private static final User uuu;
    static {
        uuu = new User("gleely");
    }
    public static void showMassge(User user, String massge) {
        uuu.getName();
        System.out.println(user.getName()+"在"+new Date()+"说："+massge);

    }

}
