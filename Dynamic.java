import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
  Stack <Person>s= new Stack();
  s.push(new Person("swaroopa", 21));
  s.push(new Person("swa", 21));
  ListIterator a=s.listIterator();
  while(a.hasNext()){
    System.out.println(a.next());
  }

}
}
