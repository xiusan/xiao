package interview.nineteen.HaoWeilai.com.xjl.controller;

import org.springframework.stereotype.Component;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/3/29 16:24
 * @Description:
 */
@Component
public class UserPay  implements  Pay{


    @Override
    public String palAll() {
        System.out.println("用户只关心付款");
        return "";

    }
}
