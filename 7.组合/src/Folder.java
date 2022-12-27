import java.util.ArrayList;
import java.util.List;

/**
 * @author ldd
 * 文件夹类
 */
public class Folder extends Node{
    //文件夹可以包含子节点（子文件夹或者文件）
    private List<Node> childrenNodes = new ArrayList<>();

    public Folder(String name) {
        super(name);//调用父类的构造方法
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);//可以添加子节点
    }

    @Override
    protected void tree(int space) {
        super.tree(space);
        space++;
        for (Node childrenNode : childrenNodes) {
            childrenNode.tree(space);
        }
    }
}