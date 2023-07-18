package gpt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 定义主题接口
interface Subject {
    void request();
}

// 实际主题类
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// 代理处理程序1
class ProxyHandler1 implements InvocationHandler {
    private Object realSubject;
    private InvocationHandler nextHandler;

    public ProxyHandler1(Object realSubject, InvocationHandler nextHandler) {
        this.realSubject = realSubject;
        this.nextHandler = nextHandler;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest1();
        Object result;
        if (nextHandler != null) {
            result = nextHandler.invoke(realSubject, method, args);
        } else {
            result = method.invoke(realSubject, args);
        }
        postRequest1();
        return result;
    }

    private void preRequest1() {
        System.out.println("ProxyHandler1: Preparing for request.");
    }

    private void postRequest1() {
        System.out.println("ProxyHandler1: Finalizing request.");
    }
}

// 代理处理程序2
class ProxyHandler2 implements InvocationHandler {
    private Object realSubject;

    public ProxyHandler2(Object realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preRequest2();
        Object result = method.invoke(realSubject, args);
        postRequest2();
        return result;
    }

    private void preRequest2() {
        System.out.println("ProxyHandler2: Preparing for request.");
    }

    private void postRequest2() {
        System.out.println("ProxyHandler2: Finalizing request.");
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        // 创建实际主题对象
        Subject realSubject = new RealSubject();

        // 创建代理处理程序1
        InvocationHandler handler1 = new ProxyHandler1(realSubject, new ProxyHandler2(realSubject));

        // 创建代理对象
        Subject proxy = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                handler1
        );

        // 调用代理对象的方法
        proxy.request();
    }
}
