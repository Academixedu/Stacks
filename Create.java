
  import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<String> list = new Stack<String>();
  list.push("Hello");
  list.push("This");
  list.push("Is");
  list.push("MY Stack");
  list.push("Assignment");
  Iterator load=list.iterator();
  while(load.hasNext())
  {
    System.out.println(load.next());
  }
}
}


