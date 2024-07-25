import java.util.Enumeration;
import java.util.Stack;

public class Enumerations {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Person> stack = new Stack<>();

        // Load Person class Objects in it
        stack.push(new Person("Hemanth", 30));
        stack.push(new Person("Manoj", 25));
        stack.push(new Person("Yash", 28));
        stack.push(new Person("Sohail", 35));

        // Iterate it by using Enumeration
        Enumeration<Person> enumeration = stack.elements();

        // Print the values by using while Loop
        System.out.println("Iterating using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
