package org.example.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 定义主题接口
interface ISubject {
    void request();
}

// 实际主题类
class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("发出request请求");
    }
}

// 代理处理程序1
class ProxyHandler1 implements InvocationHandler {
    private Object realSubject;

    public ProxyHandler1(Object realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * @param proxy 动态生成的代理对象，不是实际的代理对象，区别在于生成的代理对象已经做了增强
     * 通过asm反射库生成的
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置普通日志");
        Object result = method.invoke(realSubject, args);
        System.out.println("后置普通日志");
        return result;
    }
}

class Client {
    public static void main(String[] args) {
        // 创建实际主题对象
        ISubject realSubject = new RealSubject();

        // 创建代理对象
        ISubject proxy = (ISubject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new ProxyHandler1(realSubject)
        );

        // 调用代理对象的方法
        proxy.request();
    }
}
