package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.prototype;

import java.text.MessageFormat;

/**
 * Created by Administrator on 2019/9/15.
 */
public class MailUtils {

    public static void sendMail(Mail mail){
        String outputContent = "向:{0}同学，邮件地址:{1}，邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAdress(),mail.getContent()));
    }
    public static void saveOrignMailRecord(Mail mail){
        String orignMailContent = "存储OrignMail记录，OrignMail:"+mail.getContent();
        System.out.println(orignMailContent);
    }

}
