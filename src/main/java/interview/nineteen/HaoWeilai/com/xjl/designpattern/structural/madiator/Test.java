package interview.nineteen.HaoWeilai.com.xjl.designpattern.structural.madiator;

/**
 * 中介者 on 2019/9/26.
 */
public class Test {
    public static void main(String[] args) {
        User user  = new User("xiaowang");
        User userq  = new User("liu");

        user.showMessage("hooo");
        userq.showMessage("dasdas");

    }
}
