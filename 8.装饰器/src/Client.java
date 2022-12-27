/**
 * @author ldd
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //口红包裹粉底，粉底再包裹女生
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
        //运行结果：涂口红【打粉底【女生的脸庞】】
    }
}