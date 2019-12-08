class Person {

    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("my name is: " + name);
        }
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}


public class Classes {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "David Gourley";
        person1.age = 37;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

        System.out.println("David Gourley");
    }
}
