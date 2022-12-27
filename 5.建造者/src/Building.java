import java.util.ArrayList;
import java.util.List;

/**
 * @author ldd
 * 建筑物
 */
public class Building {

    // 用List来模拟建筑物组件的组装
    private List<String> buildingComponents = new ArrayList<>();

    public void setBasement(String basement) {// 地基
        this.buildingComponents.add(basement);
    }

    public void setWall(String wall) {// 墙体
        this.buildingComponents.add(wall);
    }

    public void setRoof(String roof) {// 屋顶
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString() {
        String buildingStr = "";
        for (int i = buildingComponents.size() - 1; i >= 0; i--) {
            buildingStr += buildingComponents.get(i);
        }
        return buildingStr;
    }

}