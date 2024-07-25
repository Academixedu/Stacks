import java.util.ListIterator;
import java.util.Stack;

public class Dynamic {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> stack = new Stack<>();

        // Load Person class Objects in it using push function
        stack.push(new Person("Hemanth", 30));
        stack.push(new Person("Manoj", 25));
        stack.push(new Person("Yash", 28));
        stack.push(new Person("Sohail", 35));

        // Iterate it by using ListIterator
        ListIterator<Person> listIterator = stack.listIterator(stack.size());

        // Print the values by using while Loop
        System.out.println("Iterating using ListIterator:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
