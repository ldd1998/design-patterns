import java.util.Arrays;
import java.util.List;

/**
 * @author ldd
 * 路由代理
 */
public class BlackUrlFilter implements Internet {

    //被代理对象
    private Internet modem;
    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    public BlackUrlFilter(Internet modem) throws Exception {
        //实例化被代理类
        this.modem = modem;
    }

    @Override
    public void httpAccess(String url) {//实现互联网访问接口方法
        for (String keyword : blackList) {//遍历黑名单
            if (url.contains(keyword)) {//是否包含黑名单中的字眼
                System.out.println("禁止访问：" + url);
                return;
            }
        }
        modem.httpAccess(url);//转发请求至“猫”以访问互联网
    }
}