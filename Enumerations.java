import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop 

    Stack<person> s = new Stack<person>();
    s.push(new person("Ram", 10));
    s.push(new person("Shyam", 20));

    Enumeration e = s.elements();
    while(e.hasMoreElements()){
      System.out.println(e.nextElement());
    }


  }}
