import java.util.Stack;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
    Stack<person> s = new Stack<person>();
     s.push(new person("Ram", 10));  
    s.push(new person("Shyam", 20));

    Iterator it = s.iterator();
    while(it.hasNext()){      
      System.out.println(it.next());
    }
}
}
