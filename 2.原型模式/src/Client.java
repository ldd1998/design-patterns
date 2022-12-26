import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<EnemyPlane> enemyPlanes = new ArrayList<EnemyPlane>();
        for (int i = 0; i < 500; i++) {
            //此处于随机纵坐标处出现敌机
            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
            enemyPlanes.add(ep);
            EnemyPlane clone = ep.clone();
            ep.setX(0);
            ep.setY(1);
            enemyPlanes.add(clone);
        }

    }

}