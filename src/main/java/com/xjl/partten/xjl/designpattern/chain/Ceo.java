package com.xjl.partten.xjl.designpattern.chain;

import java.util.Objects;

/**
 * Created by Administrator on 2020/7/6.
 */
public class Ceo extends  Handler{

    @Override
    void doPoly(PiZhun piZhun) {


        if(Objects.nonNull(piZhun.getLiyou())){
            System.out.printf("CEO请假批准");
            if(Objects.nonNull(handler)){
                handler.doPoly(piZhun);
            }
        }else {
            System.out.printf("CEO请假不批准");
        }

    }
}
