import java.util.Stack;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
Stack<Person> s = new Stack<Person>();
  // Load person class Objects in it using push function
  s.push(new Person(1, "Surya", "Hyderabad"));
  s.push(new Person(2, "madhuri", "Chennai"));
  // Iterate it by using List Iterator
  Iterator i = s.listIterator();
  // print the values by using while Loop
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
