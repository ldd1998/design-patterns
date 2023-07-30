package org.example.intranet2;

/**
 * @author ldd
 * 光猫，拨号上网前验证密码
 */
public class Modem implements Internet {

    public Modem(String password) throws Exception {
        if(!"123456".equals(password)){
            throw new Exception("拨号失败，请重试！");
        }
        System.out.println("拨号上网……连接成功！");
    }

        @Override
        public void httpAccess(String url){//实现互联网访问接口
            System.out.println("正在访问：" + url);
        }
}