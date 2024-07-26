
import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
  Stack<Person> List = new Stack<Person>();
  List.push(new Person (1,"Togar"));
  List.push(new Person(2,"Naveen")); 
  Enumeration<Person> i = List.elements();
  while(i.hasMoreElements()){
      System.out.println(i.nextElement().toString());
  }

  }}
