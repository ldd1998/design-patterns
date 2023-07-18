package intranet;

/**
 * @author ldd
 * 通过交换机上网
 */
public class Switch implements Intranet {

    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }

    @Override
    public void fileAccess2(String path) {
        System.out.println("访问内网2：" + path);
    }

}