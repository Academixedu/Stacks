import java.util.Stack;
import java.util.Iterator;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Dynamic {
    public static void main(String[] args) {
        Stack<Person> persons = new Stack<>();
        persons.add(new Person("Kamal", 38));
        persons.add(new Person("Konda", 23));
        persons.add(new Person("Hemanth", 36));
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            person.printDetails();
        }
    }
}