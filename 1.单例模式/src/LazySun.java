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

    public static LazySun getSun() {
        if (sun == null) {
            // 在这里所有的线程相当于排队，只有一个能够进入并且创建sun，
            // 等这一个出来以后，后面的再进去就在判断一次sun==null，就不会重新创建sun
            synchronized (LazySun.class) {
                if (sun == null) {
                    sun = new LazySun();
                }
            }
        }
        return sun;
    }
}
