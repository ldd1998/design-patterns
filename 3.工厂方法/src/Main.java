
/**
 * 工厂方法：每种类型产品都对应一种抽象工厂的实现类，使用的时候直接通过抽象工厂实现类生产产品
 */
public class Main {
    public static void main(String[] args) {
        LenovoFactory lenovoFactory = new LenovoFactory();
        Keyboard lenovoFactoryInstance = lenovoFactory.getInstance();

        DellKeyboardFactory dellKeyboardFactory = new DellKeyboardFactory();
        Keyboard dellKeyboardFactoryInstance = dellKeyboardFactory.getInstance();

        HPKeyboardFactory hpKeyboardFactory = new HPKeyboardFactory();
        Keyboard hpKeyboardFactoryInstance = hpKeyboardFactory.getInstance();
        //...
    }

}