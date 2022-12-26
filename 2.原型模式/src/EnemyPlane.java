/**
 * @author ldd
 * 原型模式：实现Cloneable接口，重写clone()方法。
 * 后面创建对象可以clone这个对象，并且通过set修改参数
 * 克隆方法中调用父类Object的clone方法进行的是浅拷贝，
 * 深拷贝可以自己重新new相关的对象实现
 */
public class EnemyPlane implements Cloneable{

    private int x;//敌机横坐标
    private int y = 0;//敌机纵坐标

    public EnemyPlane(int x) {//构造器
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void fly() {//让敌机飞
        y++;//每调用一次，敌机飞行时纵坐标＋1
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        return (EnemyPlane) super.clone();
    }
}