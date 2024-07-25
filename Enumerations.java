import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  Stack<Person> s = new Stack<Person>();
  // Load person class Objects in it
  s.push(new Person(1, "madhuri", "Hyderabad"));
  s.push(new Person(2, "surya", "Vijayawada"));
  // Iterate it by using Enumeration
  Enumeration e = s.elements();
  // print the values by using while Loop
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }
  }}
