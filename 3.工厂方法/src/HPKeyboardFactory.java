/**
 * @author ldd
 * 工厂方法
 */
public class HPKeyboardFactory implements IKeyboardFactory {
    @Override
    public Keyboard getInstance(){
        return new HPKeyboard();
    }
}