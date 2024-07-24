
import java.util.Enumeration;
import java.util.Stack;

public class Enumerations {
  public static void main(String[] args) {
    // Create an Object for Stack
    // Load person class Objects in it
    // Iterate it by using Enumeration
    // print the values by using while Loop
    Stack<Person_stacks> stacks = new Stack<>();
    stacks.push(new Person_stacks("chaitanya", 21));
    stacks.push(new Person_stacks("chaitu", 20));
    Enumeration<Person_stacks> it = stacks.elements();
    while (it.hasMoreElements()) {
      System.out.println(it.nextElement());
    }

  }
}
