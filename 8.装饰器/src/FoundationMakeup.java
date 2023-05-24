/**
 * @author ldd
 * 粉底装饰类
 */
public class FoundationMakeup extends Decorator{

    public FoundationMakeup(Showable showable) {
        //调用抽象父类的构造注入
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}