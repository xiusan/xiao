package rpc;

/**
 * Created by Administrator on 2019/1/31.
 */
public class EchoServiceImp  implements  EchoService{
    @Override
    public String echo(String ping) {
        return ping != null?ping+"---> I an ok !":"I an ok !";
    }
}
