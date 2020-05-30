package interview.nineteen.HaoWeilai;


import java.util.List;

/***
 *
 * 预定专享，服务政策通用集合
 * @Author xjl
 * @Description
 * @Date 16:02 2019/11/11
 **/
public class HotelReservePolicyMobileVo  {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
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

}
