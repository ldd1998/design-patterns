public class DellKeyboardFactory implements IKeyboardFactory {
    @Override
    public Keyboard getInstance(){
        return new DellKeyboard();
    }
}