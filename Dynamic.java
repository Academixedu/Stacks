import java.util.Iterator;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop

  Stack<Person> s=new Stack<>();
  s.push(new Person("Ram", 25));
  s.push(new Person("Shyam", 30));
  s.push(new Person("Mohan", 35));
  s.push(new Person("Sohan", 40));
  s.push(new Person("Rohan", 45));

  Iterator<Person> it=s.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
}
}
