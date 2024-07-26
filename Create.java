import java.util.Iterator;
import java.util.Stack;

public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<Integer> st=new Stack<>();
  st.push(67);
  st.push(68);
  st.push(69);
  st.pop();
  st.push(70);
  Iterator<Integer> i=st.iterator();
  while(i.hasNext()){
    System.out.println(i.next());
  }
    
  }
}
