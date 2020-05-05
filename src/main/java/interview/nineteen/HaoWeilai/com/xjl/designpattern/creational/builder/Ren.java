package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.builder;

/**
 * Created by Administrator on 2019/9/13.
 */
public class Ren {

    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer(){
        return computerBuilder.markComputerBuilder();

    }



}
