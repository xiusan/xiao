package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.abstractfactory;

/**
 *  2019/9/13.
 *  抽象方法
 *      创建一系列的相关或相互的对象接口相互的
 *  优点：
 *      关注解决产品族的问题，不需要关心子类实现的细节
 *
 *  缺点：
 *      当添加啊新方法就修改原来的类符合开闭原则
 *
 *  应用场景：
 *      提供一个产品库所以的方法都从一个接口输出；
 *      创建一个产品族需要创建大量的代码
 *      客户端不依赖于子类的实现细节
 *
 */
public class Test {


    public static void main(String[] args) {

        CourseFactroy courseFactroy = new PythonFactroy();
        Article article = courseFactroy.getArticle();
        article.getArticle();
        Video video = courseFactroy.getVideo();
        video.gerVideo();

    }


}
