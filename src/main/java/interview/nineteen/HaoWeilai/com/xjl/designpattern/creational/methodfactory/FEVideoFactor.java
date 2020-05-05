package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.methodfactory;


/**
 * Created by Administrator on 2019/9/13.
 */
public class FEVideoFactor extends VideoFactroy{

    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
