import java.util.Stack;
import java.util.ListIterator;

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

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> stack = new Stack<>();

        // Load Person class Objects in it using push function
        stack.push(new Person(1, "A", 5000));
        stack.push(new Person(2, "B", 6000));
        stack.push(new Person(3, "C", 7000));

        // Iterate it by using ListIterator
        ListIterator<Person> iterator = stack.listIterator();

        // Print the values by using while loop
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
