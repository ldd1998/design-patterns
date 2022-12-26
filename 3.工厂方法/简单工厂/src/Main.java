/**
 * @author ldd
 */
public class Main {
    /**
     * 测试方法
     * @param args
     */
    public static void main(String[] args) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        Keyboard lenovoKeyboard = KeyboardFactory.getInstance(BrandEnum.LENOVO.getCode());
        //...
    }
}
