package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.prototype;

/**
 *  原型模式  2019/9/15.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for (int i = 0; i < 3; i++) {
            Mail mailcp = (Mail) mail.clone();
            mailcp.setName("lisi"+i);
            mailcp.setEmailAdress(i+"lishi@.163");
            mailcp.setContent("天选之人");
            MailUtils.sendMail(mailcp);
        }
        MailUtils.saveOrignMailRecord(mail);
    }

}
