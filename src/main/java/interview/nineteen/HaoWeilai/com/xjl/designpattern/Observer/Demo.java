package interview.nineteen.HaoWeilai.com.xjl.designpattern.Observer;

/**
 *
 * 观察者模式   当状态发生变化   所用的订阅都会得到通知
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/13 23:08
 * @Description:
 */

public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        XiaoBin xiaoBin = new XiaoBin(subject);
        XiaoFang xiaoFang= new XiaoFang(subject);
        XiaoLu xiaoLu= new XiaoLu(subject);

        subject.setState(2);
    }


}
