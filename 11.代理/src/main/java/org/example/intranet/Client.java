package org.example.intranet;

import java.lang.reflect.Proxy;

/**
 * @author ldd
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 需要代理的对象
        Switch aSwitch = new Switch();
        //实例化的是代理
        BlackUrlFilter blackUrlFilter = new BlackUrlFilter(aSwitch,new HttpsFilter(aSwitch,null));
        Intranet proxyInstance = (Intranet)Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(),blackUrlFilter);
        proxyInstance.fileAccess("https://www.baidu.com");

//        proxyInstance.fileAccess2("http://www.baidu.com");
    }

}