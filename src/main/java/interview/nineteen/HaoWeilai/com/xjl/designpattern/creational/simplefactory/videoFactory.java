package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.simplefactory;

/**
 * Created by Administrator on 2019/9/13.
 */
public class videoFactory {


    public void getVideo(Class c) {

/*        ICourse iCourse = new javaVideo();
        iCourse.video();*/
        //反射
        try {
            IVideo iCourse = (IVideo) c.newInstance();
            iCourse.video();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
