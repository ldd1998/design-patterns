package org.example.intranet2;

/**
 * @author ldd
 * 路由代理
 */
public class HttpsFilter implements Internet {

    //被代理对象
    private Internet modem;

    public HttpsFilter(Internet modem) throws Exception {
        //实例化被代理类
        this.modem = modem;
    }

    @Override
    public void httpAccess(String url) {//实现互联网访问接口方法
        if(!url.contains("https")){
            System.out.println("不是https，禁止访问："+url);
            return;
        }
        modem.httpAccess(url);//转发请求至“猫”以访问互联网
    }
}