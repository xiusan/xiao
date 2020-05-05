package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.builder;

/**
 * Created by Administrator on 2019/9/13.
 */
public class ComputerAtualBuilder extends ComputerBuilder {
    private  Computer computer = new Computer();


    @Override
    public void builderName(String name) {
        computer.setName(name);
    }

    @Override
    public void builderZhuBan(String zhuBan) {
        computer.setZhuBan(zhuBan);
    }

    @Override
    public void builderCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void builderShowCart(String showCart) {
        computer.setShowCart(showCart);
    }

    @Override
    public void builderYingPan(String yingPan) {
        computer.setYingPan(yingPan);
    }

    @Override
    public Computer markComputerBuilder() {
        return computer;
    }
}
