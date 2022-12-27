/**
 * @author ldd
 * 涂口红
 */
public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}