package interview.nineteen.HaoWeilai.com.xjl.designpattern.Observer;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/13 23:04
 * @Description:
 */

public class XiaoBin extends Observer{
    public XiaoBin(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void updata(int state) {
        System.out.println("I‘m"+this.getClass().getSimpleName()+",感知变化"+state);
    }


}
