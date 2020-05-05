package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.builder;

/**
 * 建造者模式 on 2019/9/13.
 * 定义
 *      将一个创建复杂对象的创建和表示分离，通过构建可以创建不同表示
 * 优点
 *
 * 缺点
 *
 * 应用场景
 *
 * 实际例子：
 *      组装电脑
 */
public class Test {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerAtualBuilder();
        computerBuilder.builderCpu("i5");
        computerBuilder.builderName("最强");
        Ren  ren = new Ren();
        ren.setComputerBuilder(computerBuilder);
        System.out.println(ren.buildComputer().toString());



    }
}
