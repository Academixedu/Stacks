import java.util.Iterator;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
  Stack<person> list = new Stack<person>();
  list.push(new person(24, "Vishal", "B+", "Male", "Delhi"));
  Iterator<person> itr = list.iterator();
  while(itr.hasNext()){
    System.out.println(itr.next());
  }
}
}
