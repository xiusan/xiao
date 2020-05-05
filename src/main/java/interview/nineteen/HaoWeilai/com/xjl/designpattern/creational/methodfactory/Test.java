package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.methodfactory;

/**
 *   2019/9/13.
 *   工厂方法
 *          把实例创建延迟到子类中
 *   优点：
 *          解决统一产品等级能力,只需要关系那个工厂不用关系产品细节
 *   缺点：
 *          创建的产品过多会导致类的膨胀
 *   应用场景
 *          创建对象需要大量的代码，
 */
public class Test {

    public static void main(String[] args) {
        VideoFactroy videoFactroy = new FEVideoFactor();
        Video video = videoFactroy.getVideo();
        video.getVideo();
    }


}
