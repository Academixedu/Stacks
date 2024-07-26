import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop
  Stack <Person>st=new Stack<Person>();
  Person p=new Person("sai",34,75000);
  st.push(p);
  st.push(new Person("ravi",78,54000));
  st.push(new Person("ramu",56,90000));
  st.pop();
  st.push(new Person("prakash",67,78000));
  Enumeration<Person> e=st.elements();
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }
  System.out.println(st.get(1));

  }}
