import java.util.Iterator;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack

  Stack<Person> i = new Stack<Person>();

  // Load person class Objects in it using push function
  Person p= new Person(1, "srinadh", "dev");
  i.push(p);

     
   
  // Iterate it by using List Iterator

   Iterator<Person> b = i.listIterator();
  // print the values by using while Loop
  while (b.hasNext()) {
    System.out.println(b.next());
    
  }
}
}
