/**
 * @author ldd
 */

public enum BrandEnum {
    HP(0),DELL(1),LENOVO(2);
    private int code;
    private BrandEnum(int code){
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
