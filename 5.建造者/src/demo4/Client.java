package demo4;

public class Client {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John")
                .age(125)
                .address("123 Street, City, Country")
                .build();
        System.out.println(person);
    }
}
