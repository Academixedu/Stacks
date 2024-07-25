import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
   
  Stack<Integer> s=new Stack<>();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);
  s.push(5);

  Iterator<Integer> it=s.iterator();
  while(it.hasNext()){
  System.out.println(it.next());

  }

}
}
