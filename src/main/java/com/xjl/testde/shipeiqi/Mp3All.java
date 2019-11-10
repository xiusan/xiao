package com.xjl.testde.shipeiqi;

/**
 * Created by Administrator on 2019/10/31.
 */
public class Mp3All implements shipei {


    private  String name;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void playAll(String name) {
        if (name.equals("mp3")){
            System.out.println("start mp3");
        }else {
            playVideo video  = new playVideo(name);
            video.playAll(name);
        }
    }




}
