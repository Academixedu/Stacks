

import java.util.Iterator;
import java.util.Stack;

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for Stack
        // Load Personss class Objects in it using push function
        // Iterate it by using List Iterator
        // Print the values by using while Loop
        Stack<Person> list = new Stack<Person>();

        Person p1 = new Person("siva", 24, "Male", "Delhi");
        Person p2 = new Person("shiva", 21, "Male", "kkd");
        list.push(p1);
        list.push(p2);
        Iterator<Person> load = list.listIterator();
        while (load.hasNext()) {
            System.out.println(load.next());
        }
    }
}
