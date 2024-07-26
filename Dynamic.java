import java.util.Stack;
import java.util.Iterator;
public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop

  Stack<Person> List = new Stack<Person>();
  List.push(new Person (1,"Togar"));
  List.push(new Person(2,"Naveen")); 
  Iterator<Person> i = List.iterator();
  while(i.hasNext()){
      System.out.println(i.next().toString());
  }





}
}
