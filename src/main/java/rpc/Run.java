package rpc;

import java.net.InetSocketAddress;

/**
 * Created by Administrator on 2019/1/31.
 */
public class Run {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    RpcExporter.expoter("localhost",8080);
                }catch (Exception e){
                    e.printStackTrace();
                    }
            }
        }).start();
        RpcImporter<EchoService> importer = new RpcImporter<EchoService>();
        EchoService echo =
                importer.importer(EchoServiceImp.class,new InetSocketAddress("localhost",8080));
        System.out.println(echo.echo("aaa"));
    }
}
