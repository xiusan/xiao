package interview.nineteen.HaoWeilai.com.xjldemo.proxy;

/**
 * Created by xiaojinlu1990@163.com on 2019/11/26.
 */
public class ProxyImage implements Image{

    @Override
    public void display() {
        RealImage realImage = new RealImage();
        realImage.display();
    }
}
