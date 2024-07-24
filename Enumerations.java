import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  public static void main(String[]args){
   // Create an Object for Stack
   Stack<Persons> st = new Stack<Persons>();
  // Load person class Objects in it
  st.push(new Persons("nani", 25, "backend developer", 25000));
  st.push(new Persons("sai", 20, "Data Scientist", 35000));
  // Iterate it by using Enumeration
  Enumeration<Persons> e = st.elements();
  // print the values by using while Loop
  while(e.hasMoreElements()){
    System.out.println(e.nextElement());
  }

  }}
