package org.example.demo2;

public interface ISubject {
    void request();
}

class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("发出request请求");
    }
}

/**
 * 静态代理
 */
class LogProxy implements ISubject{
    ISubject subject;
    public LogProxy(ISubject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        System.out.println("前置普通日志");
        subject.request();
        System.out.println("后置普通日志");
    }
}

class client1 {
    public static void main(String[] args) {
        LogProxy proxy = new LogProxy(new SubjectImpl());
        proxy.request();
    }
}

/**
 * 如果再增加一个时间日志的增强
 */
class LogTimeProxy implements ISubject{
    ISubject subject;
    public LogTimeProxy(ISubject subject){
        this.subject = subject;
    }
    @Override
    public void request() {
        System.out.println("前置时间日志");
        subject.request();
        System.out.println("后置时间日志");
    }
}

/**
 * 与装饰者模式类似
 */
class client2 {
    public static void main(String[] args) {
        LogProxy logProxy = new LogProxy(new SubjectImpl());
        LogTimeProxy logTimeProxy = new LogTimeProxy(logProxy);
        logTimeProxy.request();
    }
}