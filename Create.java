import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<Integer> list = new Stack<Integer>();
  list.push(1);
  list.push(2);
  list.push(3);
  list.push(4);
  list.push(5);
  list.push(6);
  Iterator<Integer> itr = list.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}
}
