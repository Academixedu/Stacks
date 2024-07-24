
import java.util.Iterator;
import java.util.Stack;

public class Dynamic_stacks {
  public static void main(String[] args) {
    // Create an Object for Stack
    // Load person class Objects in it using push function
    // Iterate it by using List Iterator
    // print the values by using while Loop
    Stack<Person_stacks> stack = new Stack<>();
    stack.push(new Person_stacks("chaitanya", 21));
    stack.push(new Person_stacks("chaitu", 20));
    Iterator<Person_stacks> it = stack.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
