package gpt;

/**
 * 建造者模式被用来处理那些含有复杂构造过程的情况。
 * 它可以帮助我们构造一个复杂的对象，而无需直接实例化一个对象。这不仅使代码更具可读性，而且还提供了一种处理具有大量构造参数的类的方法
 * 问：要构建这个Person类方法有哪些
 * 1、单一构造函数，不需要传值的传null，如果参数多的情况下比较麻烦
 * 2、重载构造函数，如果参数过多的话会有很多重载函数也比较麻烦
 * 3、先new出来对象，然后根据需要的属性调用set方法赋值，如果属性之间存在依赖关系，缺少构建先后顺序
 * 问：建造者模式如何解决上面问题的
 *
 */
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Getters

    public static class PersonBuilder {
        private final String name; // Required
        private int age = 0;       // Optional
        private String address;    // Optional

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            /**
             * 这里可以写任何业务逻辑
             */
            if(age > 150){
                throw new RuntimeException("年龄输入有误，请重新输入！");
            }
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}