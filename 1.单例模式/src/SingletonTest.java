/**
 * @author ldd
 * 单例模式：一个类仅有一个实例
 */
public class SingletonTest {

    public static void main(String[] args) {
        EagerSun eagerSun = EagerSun.getSun();
        LazySun lazySun = LazySun.getSun();
        System.out.println();
    }

}