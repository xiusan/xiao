package interview.nineteen.HaoWeilai.com.xjl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/3/29 16:30
 * @Description:
 */
@RestController
public class Shoping {
    @Autowired
    private Pay pay;
    @RequestMapping("/getAll")
    public String  getAll(String user) {
        getzhangsh();
        pay.palAll();
        getwul();
        return "222";
    }
    public String  getzhangsh() {
        System.out.println("从招商银行划钱");

        return "222";

    }
    public String  getwul() {
        System.out.println("物流");
     return "222";
    }




}
