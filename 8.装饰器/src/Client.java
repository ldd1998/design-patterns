/**
 * @author ldd
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Showable girlFoundation = new FoundationMakeup(girl);
        Showable girLipstick = new Lipstick(girlFoundation);
        //口红包裹粉底，粉底再包裹女生
        girLipstick.show();
        //运行结果：涂口红【打粉底【女生的脸庞】】
    }
}