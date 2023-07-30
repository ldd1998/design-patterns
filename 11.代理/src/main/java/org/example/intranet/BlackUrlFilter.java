package org.example.intranet;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
public class BlackUrlFilter implements InvocationHandler {

    private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "小说");

    // 被代理的真实对象，如“猫”、交换机等
    private Object origin;
    private InvocationHandler nextHandle;

    public BlackUrlFilter(Object origin, InvocationHandler nextHandle) {
        this.origin = origin;//注入被代理对象
        this.nextHandle = nextHandle;
        System.out.println("开启黑名单过滤功能……");
    }

    @Override
    public Object invoke(Object proxy, Method mth, Object[] args) throws Throwable {
        //切入“方法面”之前的过滤器逻辑
        String arg = args[0].toString();
        for (String keyword : blackList) {
            if (arg.contains(keyword)) {
                System.out.println("【黑名单内禁止访问】：" + arg);
                return null;
            }
        }
        //调用被代理对象方法
        System.out.println("【黑名单校验通过】，转向实际业务……");
        Object invoke = null;
        if(nextHandle != null){
            invoke = nextHandle.invoke(origin,mth,args);
        }else {
            invoke = mth.invoke(origin,arg);
        }
        return invoke;
    }

}