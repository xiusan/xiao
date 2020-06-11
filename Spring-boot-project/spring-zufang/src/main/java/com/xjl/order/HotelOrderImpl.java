package com.xjl.order;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/6/11 22:06
 * @Description:
 */

public  class HotelOrderImpl extends HotelOrder{


    @Override
    void chackApplication(OrderParameter orderParameter) {
        ApplicationReturn applicationReturn= ApplicationReturn.builder()
                  .TrianClassNum("1")
                  .TrianName("2")
                  .build();
        super.setApplicationReturn(applicationReturn);

    }

    @Override
    void checkInPerson(OrderParameter orderParameter) {

    }

    @Override
    void chackControllerMessage(OrderParameter orderParameter) {
        ProductReturn productReturn = ProductReturn.builder()
                .orderNum("3")
                .supplierId("4")
                .build();
        super.setProductReturn(productReturn);
    }

    @Override
    void insertMysql(OrderParameter orderParameter) {
        ProductReturn productReturn = super.getProductReturn();
        ApplicationReturn applicationReturn= super.getApplicationReturn();
        System.out.println(productReturn);
        System.out.println(applicationReturn);
    }

    public static void main(String[] args) {

        HotelOrder hotelOrder = new HotelOrderImpl();
        hotelOrder.bookOrder(new OrderParameter());
    }
}
