package org.example.demo5;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class RealSubject {
    public void request() {
        System.out.println("发出request请求");
    }
}

class ProxyHandler implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("前置CGLIB日志");
        Object result = proxy.invokeSuper(obj, args); // 调用代理对象的父类方法
        System.out.println("后置CGLIB日志");
        return result;
    }
}

class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new ProxyHandler());

        RealSubject proxySubject = (RealSubject) enhancer.create();
        proxySubject.request();
    }
}
