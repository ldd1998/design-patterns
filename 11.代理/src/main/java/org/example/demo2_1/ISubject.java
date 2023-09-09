package org.example.demo2_1;

interface ISubject {
    void request();
}

class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}

abstract class SubjectDecorator implements ISubject {
    private ISubject subject;

    SubjectDecorator(ISubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }
}

class LogDecorator extends SubjectDecorator {
    LogDecorator(ISubject subject) {
        super(subject);
    }

    @Override
    public void request() {
        System.out.println("前置普通日志");
        super.request();
        System.out.println("后置普通日志");
    }
}

class LogTimeDecorator extends SubjectDecorator {
    LogTimeDecorator(ISubject subject) {
        super(subject);
    }

    @Override
    public void request() {
        System.out.println("前置时间日志");
        super.request();
        System.out.println("后置时间日志");
    }
}

class Client2 {
    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();
        subject = new LogDecorator(subject); // 添加普通日志功能
        subject = new LogTimeDecorator(subject); // 添加时间日志功能

        subject.request();
    }
}
