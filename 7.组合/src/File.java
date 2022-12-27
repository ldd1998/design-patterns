/**
 * @author ldd
 * 文件类
 */
public class File extends Node{

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
        System.out.println("不能添加子节点。");
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
    }
}