import java.util.Stack;
import java.util.Iterator;
import java.util.Enumeration;


public class prac3{
    public static void main(String[]args){
     // Create an Object for Stack
    // Load person class Objects in it
    // Iterate it by using Enumeration
    // print the values by using while Loop
       Stack s=new Stack<>();
       s.add(23);
       s.add(345);
       s.add(55876);
       s.add(0303);
     Iterator d=s.iterator();
     Enumeration r=s.elements();
     while (r.hasMoreElements()) {
        System.out.println(r.nextElement());
        
     }
  
    }
}
