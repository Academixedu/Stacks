import java.util.Stack;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack s = new Stack();
  s.push(1);
  s.push(2);
  s.push(3);
  Iterator a= s.iterator();
  while(a.hasNext()){
    System.out.println(a.next());
  }

}
}
