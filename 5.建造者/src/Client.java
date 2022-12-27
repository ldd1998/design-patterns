/**
 * @author ldd
 * 项目实施
 */
public class Client {

    public static void main(String[] args) {
        //组建别墅施工队
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        //替换施工队，建造公寓
        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }

}