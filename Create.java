import java.util.Iterator;
import java.util.Stack;

public class Create {
    public static void main(String[] args) {
        // Create an Object for Stack
        Stack<Integer> stack = new Stack<>();

        // Load Values in Stack
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        // Iterate using Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate using while loop
        System.out.println("Iterating using while loop:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
