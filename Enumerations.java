import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop

  Stack<Person> s=new Stack<>();
  s.push(new Person("Nani", 25));
  s.push(new Person("Naveen", 30));

  Enumeration<Person> e=s.elements();
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }
  
  }}
