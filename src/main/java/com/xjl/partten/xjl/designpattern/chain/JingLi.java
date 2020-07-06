package com.xjl.partten.xjl.designpattern.chain;

import java.util.Objects;

/**
 * Created by Administrator on 2020/7/6.
 */
public class JingLi extends  Handler{

    @Override
    void doPoly(PiZhun piZhun) {
        if(Objects.nonNull(piZhun.getJiaotian())){
            System.out.printf("JingLi请假批准");
            if(Objects.nonNull(handler)){
                handler.doPoly(piZhun);
            }
        }else {
            System.out.printf("JingLi请假不批准");
        }

    }
}
