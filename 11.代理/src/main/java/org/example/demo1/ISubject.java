package org.example.demo1;

public interface ISubject {
    void request();
}

class SubjectImpl implements ISubject {
    @Override
    public void request() {
        System.out.println("发出request请求");
    }
}
class client{
    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();
        subject.request();
    }
}

class client1{
    public static void main(String[] args) {
        ISubject subject = new SubjectImpl();
        System.out.println("前置日志");
        subject.request();
        System.out.println("后置日志");
    }
}

class SubjectImplSub extends SubjectImpl{
    public void request(){
        System.out.println("前置日志");
        super.request();
        System.out.println("后置日志");
    }
}
class client2{
    public static void main(String[] args) {
        SubjectImplSub subjectExtend = new SubjectImplSub();
        subjectExtend.request();
    }
}

