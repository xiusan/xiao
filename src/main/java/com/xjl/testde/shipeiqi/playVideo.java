package com.xjl.testde.shipeiqi;

/**
 * Created by Administrator on 2019/10/31.
 */
public class playVideo  implements shipei {

    private videoFactory factory;
    private  String name;

    public void setName(String name) {
        this.name = name;
    }

    public playVideo(String name) {
        if (name.equals("mp4")){
            factory = new PlayMp4();
        }else {
            factory = new PlayMp5();
        }
    }

    @Override
    public void playAll(String name) {

        if (name.equals("mp4")){
            factory.playMa4(name);
        }else {
            factory.playMa5(name);
        }

    }


}