/**
 * 这种方式通过静态内部类的方式实现了懒汉式单例，它是线程安全的，而且不需要显式地使用synchronized或volatile。
 * 当你首次访问静态内部类的静态成员或静态方法时，会触发静态内部类的初始化。
 * 当你显式创建静态内部类的实例时，也会触发静态内部类的初始化。
 */
public class LazyStaticSun {
    private LazyStaticSun() {
    }

    private static class LazyHolder {
        private static final LazyStaticSun INSTANCE = new LazyStaticSun();
    }

    public static LazyStaticSun getSun() {
        return LazyHolder.INSTANCE;
    }
}
