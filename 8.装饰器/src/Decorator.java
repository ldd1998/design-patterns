/**
 * @author ldd
 * 装饰器抽象类
 */
public abstract class Decorator implements Showable{

    protected Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
        showable.show();//直接调用不加任何装饰
    }

}