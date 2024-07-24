
import java.util.Iterator;
import java.util.Stack;

public class Create_stacks {
  public static void main(String[] args) {
    // Create an Object for Stack
    // Load Values in Stack
    // Iterate it by usig Iterator and While Loops
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    Iterator<Integer> it = stack.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
