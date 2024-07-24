import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
  Stack<person> list = new Stack<person>();
  list.push(new person(24, "Vishal", "B+", "Male", "Delhi"));
  Enumeration<person> itr = list.elements();
  while(itr.hasMoreElements()){
    System.out.println(itr.nextElement());
  }
 }
}
