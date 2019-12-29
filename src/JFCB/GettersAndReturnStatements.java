import java.sql.SQLOutput;

class Persons {

    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - this.age;

        return yearsLeft;
    }

    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
}

public class GettersAndReturnStatements {
    public static void main(String[] args) {

        Persons person1 = new Persons();

        person1.name = "Joe";
        person1.age = 25;

        person1.speak();

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirement " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age );
    }
}


