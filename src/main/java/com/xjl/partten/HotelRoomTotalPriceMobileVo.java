package com.xjl.partten;


import java.util.List;

/***
 * 房间总价格和明细 通用vo
 * @Author xjl
 * @Description
 * @Date 18:05 2019/11/25
 **/
public class HotelRoomTotalPriceMobileVo     {

    /**
     * 总价
     */
    private String name;

    public List getPriceList() {
        return priceList;
    }

    public void setPriceList(List priceList) {
        this.priceList = priceList;
    }

    /**
     * 价格明细

     */
    private List priceList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
