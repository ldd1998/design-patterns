public class LenovoFactory implements IKeyboardFactory {
    @Override
    public Keyboard getInstance(){
        return new LenovoKeyboard();
    }
}
