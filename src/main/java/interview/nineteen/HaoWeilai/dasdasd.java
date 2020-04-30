package interview.nineteen.HaoWeilai;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/4/8 19:34
 * @Description:
 */

public class dasdasd {

    public static void main(String[] args) {
        List reservePolicyList = new ArrayList<>();
        Enen enen = new Enen();
        enen.setName("22");
        reservePolicyList.add(enen);
        HotelReservePolicyMobileVo hotelReservePolicyMobileVo = new HotelReservePolicyMobileVo();
        List reservePol = new ArrayList<>();
        reservePol.add("eeewerwee");
        reservePol.add("eeewerwee");
        reservePol.add("eeewerwee");
        hotelReservePolicyMobileVo.setPriceList(reservePol);


        enen.setName("333");
        reservePolicyList.add(hotelReservePolicyMobileVo);


        List hotelPolicyMobileVoList = new ArrayList<>();



        HotelRoomTotalPriceMobileVo hotelRoomTotalPriceMobileVo = new HotelRoomTotalPriceMobileVo();

        hotelRoomTotalPriceMobileVo.setName("eeeeee");
        hotelRoomTotalPriceMobileVo.setPriceList(reservePolicyList);





        String str = JSONObject.toJSONString(hotelRoomTotalPriceMobileVo, SerializerFeature.WriteNullStringAsEmpty,

                SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteNullListAsEmpty,

                SerializerFeature.WriteNullNumberAsZero);









        JSONObject jsonObject = JSONObject.parseObject(str);
        System.out.println(jsonObject.toJSONString());
    }
}
