import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
    Stack<Integer> s = new Stack<Integer>();

    s.push(10);
    s.push(20);
    s.push(30);

    Iterator it = s.iterator();

    while(it.hasNext()){
      System.out.println(it.next());
    }

}
}
