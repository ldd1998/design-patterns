/**
 * 简单工厂：通过传入参数判断生产何种产品
 */
public class KeyboardFactory {
    public static Keyboard getInstance(int brand) {
        if(BrandEnum.HP.getCode() == brand){
            return new HPKeyboard();
        } else if(BrandEnum.LENOVO.getCode() == brand){
            return new LenovoKeyboard();
        } else if(BrandEnum.DELL.getCode() == brand){
            return new DellKeyboard();
        }
        return null;
    }
}