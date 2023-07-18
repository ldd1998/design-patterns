package intranet;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class HttpsFilter implements InvocationHandler {


    // 被代理的真实对象
    private Object origin;
    private InvocationHandler nextHandle;

    public HttpsFilter(Object origin, InvocationHandler nextHandle) {
        this.origin = origin;//注入被代理对象
        this.nextHandle = nextHandle;
        System.out.println("开启HTTPS过滤功能……");
    }

    @Override
    public Object invoke(Object proxy, Method mth, Object[] args) throws Throwable {
        //切入“方法面”之前的过滤器逻辑
        String arg = args[0].toString();
        if(arg != null && !arg.contains("https")){
            System.out.println("【HTTP禁止访问】");
            return "";
        }
        //调用被代理对象方法
        System.out.println("【HTTPS校验通过】，转向实际业务……");
        Object invoke = null;
        if(nextHandle != null){
            invoke = nextHandle.invoke(origin,mth,args);
        }else {
            invoke = mth.invoke(origin,arg);
        }
        return invoke;
    }

}