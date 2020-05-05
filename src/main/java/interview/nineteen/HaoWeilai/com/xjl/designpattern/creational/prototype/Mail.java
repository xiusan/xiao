package interview.nineteen.HaoWeilai.com.xjl.designpattern.creational.prototype;

/**
 * Created by Administrator on 2019/9/15.
 */
public class Mail implements Cloneable{
    private String name;
    private String emailAdress;
    private String content;

    public Mail() {
        System.out.println("mail Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAdress='" + emailAdress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
