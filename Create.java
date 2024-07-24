import java.util.Enumeration;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
Stack<Integer> st = new Stack<Integer>();
  // Load Values in Stack
  st.push(10);
  st.push(20);
  st.push(30);
  st.push(40);
  st.push(50);
  
  // Iterate it by usig Iterator and While Loops
  Enumeration<Integer> e = st.elements();
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }
}
}
