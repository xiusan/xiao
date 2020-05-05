package interview.nineteen.HaoWeilai.com.xjldemo.singleton;

/**
 * Created by Administrator on 2019/11/20.
 */
public class Singleton
{
    private static Singleton singleton;
    public Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
