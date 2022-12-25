/**
 * @author ldd
 * 饿汉模式：在使用的时候才创建对象
 */
public class LazySun {
    /**
     * volatile保证各个线程在第二次判断sun == null的可见性
     */
    private volatile static LazySun sun = null;

    private LazySun() {

    }

    public LazySun getSun() {
        if (sun == null) {
            synchronized (LazySun.class) {
                if (sun == null) {
                    sun = new LazySun();
                }
            }
        }
        return sun;
    }
}
