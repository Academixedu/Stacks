
import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
  Stack<Person> list=new Stack<Person>();
        Person p1 = new Person("siva", 24, "Male", "Delhi");
        Person p2 = new Person("shiva", 21, "Male", "kkd");
        list.push(p1);
        list.push(p2);
        Enumeration e =list.elements();
        while (e.hasMoreElements()){
          System.out.println(e.nextElement());
        }

  }}
