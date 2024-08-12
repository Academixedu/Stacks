import java.util.Stack;
import java.util.Enumeration;

class Person {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

public class Enumerations {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> stack = new Stack<>();

        // Load Person class Objects in it
        stack.push(new Person(1, "A", 5000));
        stack.push(new Person(2, "B", 6000));
        stack.push(new Person(3, "Ch", 7000));

        // Iterate it by using Enumeration
        Enumeration<Person> enumeration = stack.elements();

        // Print the values by using while loop
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
