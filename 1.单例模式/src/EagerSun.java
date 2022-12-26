/**
 * @author ldd
 * 饿汉模式：一开始就实例化好对象
 */
public class EagerSun {
    /**
     * 私有化并创建自己的永久实例，
     * “static”关键字确保太阳的静态性，将太阳放入内存里的静态区，在类加载的时候就初始化了，
     * 它与类同在，也就是说它是与类同时期且早于内存堆中的对象实例化的，该实例在内存中永生
     **/
    private static final EagerSun SUN = new EagerSun();

    /**
     * 私有化方法，防止任何人都可以创建太阳
     */
    private EagerSun() {
    }

    /**
     * 通过get方法使别人获取
     */
    public static EagerSun getSun() {
        return SUN;
    }
}
