package interview.nineteen.HaoWeilai.com.xjldemo.bridge;

/**
 * Decorator  装饰者
 *
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，
 * 同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装
 */
public class Demo {
    public static void main(String[] args) {
        DecoratorStart decoratorStart = new DecoratorStart();
        decoratorStart.setSunWuKong(new SiMiao());
        decoratorStart.Change();
        decoratorStart.setSunWuKong(new Bird());
        decoratorStart.Change();


    }
}
