/**
 * @author ldd
 * 抽象节点
 */
public abstract class Node {
    protected String name;//节点命名

    public Node(String name) {//构造方法需传入节点名
        this.name = name;
    }

    //添加下级子节点方法
    protected abstract void add(Node child);
    protected void tree(int space){
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(name);
    }
    protected void tree(){
        this.tree(0);
    }
}
