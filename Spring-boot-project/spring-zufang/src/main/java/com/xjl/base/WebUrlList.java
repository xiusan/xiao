package com.xjl.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @param
 * @author zhangzehuan
 * @return
 * @date 2019/8/9 13:39
 */
public class WebUrlList {

    public static final String DOMAIN = "/web";
    public static final String ORDER_REFUND = DOMAIN + "/orderRefund";
    public static final String PENDING_ORDER = DOMAIN + "/pendingOrder";
    public static final String ADDITIONAL_RECORDING_ORDER = DOMAIN + "/additionalRecordingOrderController";
    public static final String APPLICATION = DOMAIN + "/application";
    public static final String AREA = DOMAIN + "/area";
    public static final String BRAND = DOMAIN + "/brand";
    public static final String DICT = DOMAIN + "/dictController";
    public static final String HOMEPAGE = DOMAIN + "/homePage";
    public static final String HOTEL = DOMAIN + "/hotel";
    public static final String HOTEL_ORDER = DOMAIN + "/hotelOrder";
    public static final String HOTEL_ORDER_DETAIL = DOMAIN + "/hotelOrderDetail";
    public static final String HOTEL_ORDER_RECORD = DOMAIN + "/hotelOrderRecord";
    public static final String HOTEL_ORDER_ROOM_OCCUPANT = DOMAIN + "/hotelOrderRoomOccupant";
    public static final String HOTEL_RESERVE = DOMAIN + "/hotelReserve";
    public static final String KEYWORDS = DOMAIN + "/keywords";
    public static final String STARS = DOMAIN + "/stars";
    public static final String HOTEL_ACCOUNT = DOMAIN + "/hotelAccount";

    /**
     * 所有接口List
     */
    public static List<String> webList = new ArrayList<String>();

    /**
     * 需验证Token的接口
     */
    public static List<String> AuthTokenApiList = new ArrayList<String>();

    static {
        webList.add(DOMAIN);
        webList.add(ORDER_REFUND);
        webList.add(PENDING_ORDER);
        webList.add(ADDITIONAL_RECORDING_ORDER);
        webList.add(APPLICATION);
        webList.add(AREA);
        webList.add(BRAND);
        webList.add(DICT);
        webList.add(HOMEPAGE);
        webList.add(HOTEL);
        webList.add(HOTEL_ORDER);
        webList.add(HOTEL_ORDER_DETAIL);
        webList.add(HOTEL_ORDER_RECORD);
        webList.add(HOTEL_ORDER_ROOM_OCCUPANT);
        webList.add(HOTEL_RESERVE);
        webList.add(KEYWORDS);
        webList.add(STARS);
    }
}
