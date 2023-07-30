package org.example.intranet2;

/**
 * @author ldd
 * 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //实例化的是代理
        Internet proxy = new BlackUrlFilter(new HttpsFilter(new Modem("123456")));
        proxy.httpAccess("https://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("ftp://www.学习.com/java");
        proxy.httpAccess("https://www.工作.com");
    }

}