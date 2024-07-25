import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack

   Stack<Person> b = new Stack<Person>();
  // Load person class Objects in it
   Person p = new Person(1, "Sri", "dev");
   b.push(p);
  // Iterate it by using Enumeration
   Enumeration c = b.elements();
  // print the values by using while Loop
  while(c.hasMoreElements()){
    System.out.println(c.nextElement());
  }

  }
}
