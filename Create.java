import java.util.Enumeration;
import java.util.Stack;
public class Create{
public static void main(String[]args){
// Create an Object for Stack
Stack<Integer> s = new Stack<Integer>();
  // Load Values in Stack
  s.push(10);
  s.push(20);
  s.push(30);
  s.push(40);
  s.push(50);
  // Iterate it by usig Iterator and While Loops
  Enumeration e = s.elements();
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }
}
}
