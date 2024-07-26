import java.util.Stack;
import java.util.Enumeration;
public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
  Stack s=new Stack();
  s.push(new Person("swapna", 21));
  s.push(new Person("soppi", 21));
  Enumeration a=s.elements();
  while(a.hasMoreElements()){   
    System.out.println(a.nextElement());              
  }

  }}
