package com.xjl.partten.xjldemo.flyweight;

/**
 * Created by xiaojinlu1990@163.partten on 2019/11/27.
 *  享元模式  画出不同颜色的元
 */
public class Demo {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        FactoryFly factoryFly = new FactoryFly();
        for(int i=0; i < 20; ++i) {
            Shape circle =
                    (Circle)factoryFly.getShape(getRandomColor());
            circle.draw();
        }
    }



    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
}
